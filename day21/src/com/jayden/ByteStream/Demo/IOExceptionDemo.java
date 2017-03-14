package com.jayden.ByteStream.Demo;

import java.io.IOException;
import java.io.FileOutputStream;

/**
 * Created by DaiLiang on 2017/3/14.
 * IOException 演示
 */
public class IOExceptionDemo {
    public static void main(String[] args) {
        FileOutputStream ioe = null;
        try {
            ioe = new FileOutputStream("temp_files\\IOExceptionDemo.txt");
            ioe.write("IOException".getBytes());
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