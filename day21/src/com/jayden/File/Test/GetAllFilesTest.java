package com.jayden.File.Test;

import java.io.File;

/**
 * Created by DaiLiang on 2017/3/11.
 * Get all files in the dir which you have chose.
 */
public class GetAllFilesTest {
    public static void main(String[] args) {
        File dir = new File("G:\\bxdjava\\day17_collection");
        getFiles(dir);
    }

    private static void getFiles(File dir) {
        File[] files = dir.listFiles();
        /*
         * 递归的方式，遍历所有目录。
         */
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory())
                    getFiles(file);
                else
                    System.out.println(file);
            }
        }
    }
}
