package com.jayden.CharStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by DaiLiang on 2017/3/16.
 * 字符流缓冲区——BufferedWriter
 */
public class CharStreamBufferedDemo1 {
    public static void main(String[] args) throws IOException {
        writeTextByBuffered();
    }

    private static void writeTextByBuffered() throws IOException {
//        1、创建文件写入对象——缓冲区需要缓冲的内容
        FileWriter fw = new FileWriter("temp_files\\CharBuffered.txt");
//        2、创建缓冲区对象
        BufferedWriter bw = new BufferedWriter(fw);
//        3、通过缓冲区写入内容
        for (int i = 0; i < 10 ; i++) {
            bw.write(i + "abced");
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
}
