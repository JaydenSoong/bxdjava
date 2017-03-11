package com.jayden.File.Demo;

import com.jayden.File.Filter.FilterByFile;

import java.io.File;

/**
 * Created by DaiLiang on 2017/3/11.
 * File Filter Demo
 */
public class FileFilterDemo {
    public static void main(String[] args) {
        File f = new File("C:\\");
        fileFilter(f);
    }

    private static void fileFilter(File f) {
        File[] files = f.listFiles(new FilterByFile());
        for (File file : files) {
            System.out.println(file);
        }
    }
}
