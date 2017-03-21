package com.jayden.IO.Test;

import java.io.*;

/**
 * Created by SOONG on 2017/3/21.
 * 需求2：读取文本文件中的数据，将其打印到控制台上。
 */
public class IOTest02 {
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
         *      源：硬盘 File
         *      目的：显示器 System.out
         *
         * FileReader fr = new FileReader("IOtest.txt");
         * OutputStream(PrintStream) out = System.out;
         *
         * 将读取到的字节存储到数组中 read(byte[])
         * 使用 PrintStream 直接调用 println 方法就可以打印了。如果使用 OutputStream 可以调用 writer 方法就可以将数据
         * 写入到显示器上。
         *
         * 但是麻烦，因为明确源是字符数据，需要将字符流转成字节流，这样操作就便捷了。
         *
         * 明确四：需要功能吗？
         * 需要，转换。字符 ---> 字节。 OutputStreamWriter
         *
         * FileReader fr = new FileReader("IOtest.txt");
         * OutputStreamWriter osw = new OutputStreamWriter(System.out);
         * 一次读取一个字符，将读到的字符写入。也可以定义字符缓冲区。
         *
         * 需要定义其它功能吗？
         * 需要：高效。Buffered
         *
         */
        BufferedReader bufr = new BufferedReader(new FileReader("IOtest.txt"));
        BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line;
        while ((line = bufr.readLine()) != null){
            bufw.write(line);
            bufw.newLine();
            bufw.flush();
        }
        bufr.close();
    }
}
