package com.jayden.CharStream;

import java.io.*;

/**
 * Created by DaiLiang on 2017/3/16.
 * 不同的编码表
 * IDEA 的默认编码表已经被设置为UTF-8 演示的时候需要注意
 */
public class TransStreamDemo {
    public static void main(String[] args) throws IOException {
        writeCNText();
        readCNText();
    }

    private static void readCNText() throws IOException {
//        创建文件输入流对象
        FileInputStream fis = new FileInputStream("temp_files\\gbk.txt");
//        创建字符流对象——桥梁
        InputStreamReader inr = new InputStreamReader(fis);
//        读取中文
        int ch1 = inr.read();
        System.out.println("ch1 = " + (char) ch1);
        int ch2 = inr.read();
        System.out.println("ch2 = " + (char) ch2);
        int ch3 = inr.read();
        System.out.println("ch3 = " + (char) ch3);
        int ch4 = inr.read();
        System.out.println("ch4 = " + (char) ch4);
        int ch5 = inr.read();
        System.out.println("ch5 = " + (char) ch5);
        int ch6 = inr.read();
        System.out.println("ch6 = " + (char) ch6);
        int ch7 = inr.read();
        System.out.println("ch7 = " + (char) ch7);
        int ch8 = inr.read();
        System.out.println("ch8 = " + (char) ch8);
        int ch9 = inr.read();
        System.out.println("ch9 = " + (char) ch9);

//        关闭资源
        inr.close();
    }

    private static void writeCNText() throws IOException {
//        创建文件输出流对象
        FileOutputStream fos = new FileOutputStream("temp_files\\gbk.txt");
//        创建字符流对象——桥梁
        OutputStreamWriter osw = new OutputStreamWriter(fos,"GBK");
//        写入中文
        osw.write("成都棠湖外国语学校");
//        关闭资源
        osw.close();
    }
}
