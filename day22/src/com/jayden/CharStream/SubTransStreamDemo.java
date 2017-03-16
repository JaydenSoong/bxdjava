package com.jayden.CharStream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by DaiLiang on 2017/3/16.
 * 文件读写便捷类 —— FileReader、FileWriter
 */
public class SubTransStreamDemo {
    public static void main(String[] args) throws IOException {
        writeByFileWriter();
        readByFileReader();
    }

    private static void readByFileReader() throws IOException {
        FileReader fr = new FileReader("temp_files\\fw.txt");
        int length;
        while ((length = fr.read()) != (-1)) {
            System.out.println((char) length);
        }
        fr.close();
    }

    private static void writeByFileWriter() throws IOException {
        FileWriter fw = new FileWriter("temp_files\\fw.txt");
        fw.write("你好");
        fw.close();
    }
}
