package com.jayden.FileInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by DaiLiang on 2017/3/14.
 * 文件输入流演示
 */
public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
//        1、指定需操作的文件对象
        File file = new File("temp_files\\inputDemo.txt");
        if(!file.exists()) {
            throw new RuntimeException("要读取的文件不存在");
        }

//        2、创建文件输入流对象
        FileInputStream fis = new FileInputStream(file);

//        3、读文件
        int byt;
        while ((byt = fis.read()) != -1) {
            System.out.println(byt);
        }

//        4、释放资源
        fis.close();
    }
}
