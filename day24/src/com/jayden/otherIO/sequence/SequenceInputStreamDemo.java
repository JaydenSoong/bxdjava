package com.jayden.otherIO.sequence;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

/**
 * Created by DaiLiang on 2017/3/22.
 * 演示序列流
 */
public class SequenceInputStreamDemo {
    public static void main(String[] args) throws IOException {
//        1、创建集合，存储多个流对象
        ArrayList<FileInputStream> al = new ArrayList<>();
        for (int i = 1; i <= 3 ; i++) {
            al.add(new FileInputStream("temple_files\\s" + i + ".txt"));
        }

//        2、利用 Collections 类的特有方法，返回枚举
        Enumeration<FileInputStream> en = Collections.enumeration(al);

//        3、创建 SequenceInputStream
        SequenceInputStream sqis = new SequenceInputStream(en);

//        4、创建目的
        FileOutputStream fos = new FileOutputStream("temple_files\\s4.txt");

//        5、多次写入
        byte[] bytes = new byte[1024];
        int len;
        while ((len = sqis.read(bytes)) != -1){
            fos.write(bytes, 0, len);
        }
//        6、关流
        sqis.close();
        fos.close();
    }
}
