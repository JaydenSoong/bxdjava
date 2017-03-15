package com.jayden.FileInputStream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by DaiLiang on 2017/3/15.
 * 文件输入流演示——缓冲区
 */
public class FileInputStreamDemo2 {
    private static final int DEFAULT_SIZE = 1024;

    public static void main(String[] args) {
        FileInputStream file = null;

        try {
            file = new FileInputStream("temp_files\\inputDemo.txt");
            byte[] buf = new byte[DEFAULT_SIZE];
            int length;
            while ((length = file.read(buf)) != -1) {
                System.out.println(new String(buf, 0, length));
            }
        } catch (IOException e) {

        } finally {
            if (file != null)
                try {
                    file.close();
                } catch (IOException e){
                throw new RuntimeException(e);
                }
        }
    }
}
