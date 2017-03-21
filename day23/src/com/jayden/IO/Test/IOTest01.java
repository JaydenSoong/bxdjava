package com.jayden.IO.Test;

import java.io.*;

/**
 * Created by SOONG on 2017/3/21.
 * 需求1：通过键盘录入数据，将数据保存到一个文件中。
 */
public class IOTest01 {
    public static void main(String[] args) throws IOException {
        /*
         * 明确一：有源吗？有。有目的吗？有。
         *      源：InputStream Reader
         *      目的：OutputSteam Writer
         *
         * 明确二：是纯文本文件吗？是。
         *      源：Reader
         *      目的：Writer
         *
         * 明确三：具体设备
         *      源：键盘
         *      目的：硬盘
         * InputStream is = System.in;
         * FileWriter fw = new FileWriter("IOtest.txt");
         *
         * 将读取到的字节存储到数组中 read(byte[])
         * 将字节数组转成字符串
         * 通过 fw.write(String) 写入到文件中。
         *
         * 但是麻烦，因为明确源是 Reader，需要就字节流转成字符流，这样操作就便捷了。
         *
         * 明确四：需要功能吗？
         * 需要，转换。字节 ---> 字符。 InputStreamReader
         *
         * InputStreamReader isr = new InputStreamReader(System.in);
         * FileWriter fw = new FileWriter("IOtest.txt");
         * 一次读取一个字符，将读到的字符写入。也可以定义字符缓冲区。
         *
         * 需要定义其它功能吗？
         * 需要：高效。Buffered
         *
         */
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new FileWriter("IOtest.txt"));

        String line;
        while ((line = bfr.readLine()) != null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
//        键盘输入流可以不用关闭
//        bfr.close();
        bw.close();
    }
}
