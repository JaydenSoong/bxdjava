package com.jayden.Bufferd;

import java.io.*;

/**
 * Created by DaiLiang on 2017/3/15.
 * 缓冲区对象演示
 */
public class CopyByBuffered {
    private static final int DEFAULT_SIZE = 2048;

    public static void main(String[] args) {
        copyPicByBuffered();
    }

    private static void copyPicByBuffered() {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("temp_files\\pic.jpg");
            BufferedInputStream  buffis = new BufferedInputStream(fis);
            fos = new FileOutputStream("temp_files\\pic_1.jpg");
            BufferedOutputStream buffos = new BufferedOutputStream(fos);
            int length;
            byte[] bytes = new byte[DEFAULT_SIZE];
            while ((length = buffis.read(bytes)) != -1)
                buffos.write(bytes, 0, length);
                buffos.flush();
        } catch (IOException e) {
            // 运行日志
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
                    // 运行日志
                }
        }
    }
}
