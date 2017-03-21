package com.jayden.IO.Test;

import java.io.*;

/**
 * Created by SOONG on 2017/3/21.
 * 读取文本文件，将数据按 GBK 编码保存到文件中。
 */
public class IOTest04 {
    public static void main(String[] args) throws IOException {
        /*
         * 明确一：有源吗？有。有目的吗？有？
         *     源：InputStream Reader
         *   目的：OutputStream Writer
         *
         * 明确二：是纯文本文件吗？是
         *     源：Reader
         *   目的：Writer
         *
         * 明确三：具体设备
         *     源：硬盘
         *   目的：硬盘
         *
         * FileReader fr = new FileReader("IO流_3.txt");
         * FileWriter fw = new FileWriter("IO流_3_GBK.txt");
         *
         * 明确四：需要功能吗？
         * 需要，高效。Buffered
         *
         * BufferedReader bufr = new BufferedReader(new FileReader("IO流_3.txt"));
         * BufferedWriter bufw = new BufferedWriter(new FileWriter("IO流_3_GBK.txt"));
         *
         * 还要其它功能吗？
         * 要，转换流。
         * OutputStreamWriter(OutputStream out, String charsetName)
         */

        BufferedReader bufr = new BufferedReader(new FileReader("IO流_3.txt"));
        BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("IO流_3_GBK.txt"), "GBK"));
        String line;
        while ((line = bufr.readLine()) != null){
            bufw.write(line);
            bufw.newLine();
            bufw.flush();
        }
        bufr.close();
        bufw.close();
  }
}
