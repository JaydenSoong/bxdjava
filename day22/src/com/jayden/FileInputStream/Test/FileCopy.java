package com.jayden.FileInputStream.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by DaiLiang on 2017/3/15.
 * 文件复制方式一，一个字节一个字节的复制。
 */
public class FileCopy {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("F:\\BaiduYunDownload\\day22_avi\\IO流\\15-IO流-字节流-FileInputStream读取字节.avi");
        FileOutputStream fos = new FileOutputStream("temp_files\\inputDemo_2.avi");

        int by;
        while ((by = fis.read()) != -1)
            fos.write(by);
        fis.close();
        fos.close();
    }
}
