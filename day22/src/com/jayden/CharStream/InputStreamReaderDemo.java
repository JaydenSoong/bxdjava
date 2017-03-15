package com.jayden.CharStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by DaiLiang on 2017/3/15.
 * 字符流向字节流的桥梁
 */
public class InputStreamReaderDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("temp_files\\CN.txt");
        InputStreamReader inr = new InputStreamReader(fis);
        int ch1 = inr.read();
        System.out.println((char) ch1);
        inr.close();
    }
}
