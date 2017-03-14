package com.jayden.ByteStream.Demo;

import java.io.IOException;
import java.io.FileOutputStream;

/**
 * Created by DaiLiang on 2017/3/14.
 * IOException 演示
 */
public class IOExceptionDemo {
    public static final String LINE_SEPARATOR = System.lineSeparator();
    public static void main(String[] args) {
        FileOutputStream ioe = null;
        try {
            ioe = new FileOutputStream("temp_files\\IOExceptionDemo.txt", true); //加入参数 true, 实现续写。
            String str = LINE_SEPARATOR + "IOException";
            ioe.write(str.getBytes());
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            
            if(ioe != null)
                try {
                    ioe.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
        }
    }
}