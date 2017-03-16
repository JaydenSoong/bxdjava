package com.jayden.CharStream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by DaiLiang on 2017/3/16.
 * 复制文本文件
 */
public class CopyFile {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("temp_files\\CN.txt");
        FileWriter fw = new FileWriter("temp_files\\CN_1.txt");
        char[] chars = new char[1024];
        int length;
        while ((length = fr.read(chars)) != -1)
            fw.write(chars, 0, length);
        fr.close();
        fw.close();
    }
}
