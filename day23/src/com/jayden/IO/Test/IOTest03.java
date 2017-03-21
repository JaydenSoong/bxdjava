package com.jayden.IO.Test;

import java.io.*;

/**
 * Created by SOONG on 2017/3/21.
 * 需求3：通过键盘录入数据，转成大写打印到控制台上。
 */
public class IOTest03 {
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
         *      源：键盘 System.in
         *      目的：显示器 System.out
         *
         * InputStream in = System.in;
         * OutputStream out = System.out;
         *
         * 明确四：需要定义其它功能吗？
         * 需要：高效。Buffered
         */
        BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line;
        while ((line = bufr.readLine()) != null) {
            if ("over".equals(line))
                break;
            bufw.write(line.toUpperCase());
            bufw.flush();
        }
    }
}
