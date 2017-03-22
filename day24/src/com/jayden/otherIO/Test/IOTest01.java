package com.jayden.otherIO.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Properties;

/**
 * Created by SOONG on 2017/3/22.
 * 切割文件，合并文件
 */
public class IOTest01 {
    public static void main(String[] args) throws IOException {
//        被切割的文件
        File srcFile = new File("D:\\3.jpg");

//        碎片文件存放路径
        File destDir = new File("temp_files\\parts");

//        splitFile(srcFile, destDir);
        mergeFile();
    }

    /**
     * SequenceInputStream 的方法，合并文件。
     * @throws IOException
     */
    private static void mergeFile() throws IOException {
//        1、创建集合，存储多个流对象
        ArrayList<FileInputStream> al = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            al.add(new FileInputStream("temp_files\\parts\\" + i + ".part"));
        }

//        2、利用 Collections 类的特有方法，返回枚举
        Enumeration<FileInputStream> en = Collections.enumeration(al);

//        3、创建 SequenceInputStream
        SequenceInputStream sis = new SequenceInputStream(en);

//        4、创建目的
        FileOutputStream fos = new FileOutputStream("temp_files\\3.jpg");

//        5、多次写入
        byte[] bytes = new byte[1024 * 1024];
        int len;
        while ((len = sis.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }

//        6、关流
        sis.close();
        fos.close();
    }

    private static void splitFile(File srcFile, File destDir) throws IOException {
//        1、健壮性判断
        if (!srcFile.exists()) {
            throw new RuntimeException(srcFile.getAbsolutePath() + "，源文件不在");
        }

        if (!destDir.exists()) {
            destDir.mkdirs();
        }

//        2、明确源（创建文件输入流）
        FileInputStream fis = new FileInputStream(srcFile);

//        3、明确目的（创建文件输出流）
        FileOutputStream fos;

//        4、缓冲区的大小（1M）
        byte[] bytes = new byte[1024 * 1024];
        int len;
        int count = 0;
//        5、往缓冲区存数据
        while ((len = fis.read(bytes)) != -1) {
//            6、明确写入的文件对象，创建输出流
            File partFile = new File(destDir, (++count) + ".part");
            fos = new FileOutputStream(partFile);
            fos.write(bytes, 0, len);
            fos.close();
        }

        fis.close();

//        7、创建配置文件（碎片属性集）
        Properties prop = new Properties();
        prop.setProperty("part", Integer.toString(count));
        prop.setProperty("fileName", srcFile.getName());
        File configFile = new File(destDir, (++count) + ".properties");
        FileOutputStream fos1 = new FileOutputStream(configFile);
        prop.store(fos1,"part info");

//        8、关流
        fos1.close();
    }
}
