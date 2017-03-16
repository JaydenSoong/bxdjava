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
        FileInputStream fis = new FileInputStream("temp_files\\U8.txt");
//        创建字符流对象——桥梁
        InputStreamReader inr = new InputStreamReader(fis,"UTF-8");
//        读取中文
        int ch;
        while ((ch = inr.read()) != -1) {
            System.out.println((char) ch);
        }

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
