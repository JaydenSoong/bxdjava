package com.jayden.CharStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * Created by DaiLiang on 2017/3/15.
 * 字节流向字符流的桥梁
 */
public class OutputStreamWriterDemo {
    public static void main(String[] args) throws IOException {
        writeCN();
    }

    private static void writeCN() throws IOException {
//        1、创建文件流对象
        FileOutputStream fos = new FileOutputStream("temp_files\\CNGBK.txt");
//        2、创建字符写入流对象
        OutputStreamWriter opw = new OutputStreamWriter(fos);
//        3、调用写方法，写入数据时，都会先写入缓冲区，因为要查表
        opw.write("字节流向字符流的桥梁");
//        需要刷新缓冲区，将数据存到目的地
//        opw.flush();
//        4、释放资源，close() 方法会自动调用 flush() 方法
        opw.close();
    }
}
