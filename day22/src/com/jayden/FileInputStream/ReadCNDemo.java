package com.jayden.FileInputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by DaiLiang on 2017/3/15.
 * 读取中文
 */
public class ReadCNDemo {
    private static final int DEFAULT_SIZE = 1024;
    public static void main(String[] args) throws IOException {
        ReadCN();
    }

    private static void ReadCN() throws IOException {
        FileOutputStream fos = new FileOutputStream("temp_files\\CN.txt");
        fos.write("成都棠湖外国语学校".getBytes());
        fos.close();
        FileInputStream fis = new FileInputStream("temp_files\\CN.txt");
        byte[] bytes = new byte[DEFAULT_SIZE] ;
        int length;
        while ((length = fis.read(bytes)) != -1)
            System.out.println(new String(bytes, 0, length));
    }
}
