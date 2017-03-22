package com.jayden.otherIO.RandomAccessFile;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by DaiLiang on 2017/3/22.
 * RandomAccessFile 演示
 */
public class RandomAccessFileDemo {
    public static void main(String[] args) throws IOException {
//        writeFile();
        readFile();
    }

    private static void readFile() throws IOException {
        RandomAccessFile raf = new RandomAccessFile("temple_files\\random.txt", "r");
//        随机读取，只要设置指针位置即可。
        raf.seek(10);
        byte[] bytes = new byte[6];
        raf.read(bytes);
        String name = new String(bytes);
        System.out.println(name);
    }

    private static void writeFile() throws IOException {
//        1、创建一个随机访问文件对象，文件不存在，则创建。文件存在，则不创建
        RandomAccessFile raf = new RandomAccessFile("temple_files\\random.txt", "rw");

//        2、写入姓名和年龄
        raf.write("张三".getBytes());
        raf.writeInt(34);
        raf.write("李四".getBytes());
        raf.writeInt(31);

//        3、随机写入
        System.out.println(raf.getFilePointer());
        raf.seek(10);   //设置指针位置
        raf.write("五五".getBytes());
        raf.writeInt(220);
        raf.close();
    }
}
