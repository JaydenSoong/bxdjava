package com.jayden.FileInputStream.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by DaiLiang on 2017/3/15.
 * 文件复制方式二——缓冲区
 */
public class FileCopyByBuffer {
    private static final int DEFAULT_SIZE = 1024;

    public static void main(String[] args) {
        copyFile();
    }

    private static void copyFile() {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("F:\\BaiduYunDownload\\day22_avi\\IO流\\15-IO流-字节流-FileInputStream读取字节.avi");
            fos = new FileOutputStream("temp_files\\inputDemo3.avi");
            byte[] buff = new byte[DEFAULT_SIZE];
            int length;
            while ((length = fis.read(buff)) != -1)
                fos.write(buff, 0, length);
        } catch (IOException e) {
            //运行日志
        }finally {
            if (fis != null)
                try {
                    fis.close();
                } catch (IOException e) {
                    //运行日志
                }
            if (fos != null)
                try {
                    fos.close();
                } catch (IOException e) {
                    //运行日志
                }
        }
    }
}
