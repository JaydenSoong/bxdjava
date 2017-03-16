package com.jayden.CharStream;

import java.io.*;

/**
 * Created by DaiLiang on 2017/3/16.
 * 字符流缓冲区——BufferedReader
 */
public class CharStreamBufferedDemo2 {
    public static void main(String[] args) throws IOException {
        readTextByBuffered();
    }

    private static void readTextByBuffered() throws IOException {
//        1、创建文件读取——缓冲区需要缓冲的内容
        FileReader fr = new FileReader("temp_files\\CharBuffered.txt");
//        2、创建缓冲区对象
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null)
            System.out.println(line);
        br.close();
    }
}
