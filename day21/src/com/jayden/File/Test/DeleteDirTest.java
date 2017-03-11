package com.jayden.File.Test;

import java.io.File;

/**
 * Created by DaiLiang on 2017/3/11.
 * Delete a Directory which is not null.
 */
public class DeleteDirTest {
    public static void main(String[] args) {
        File dir = new File("G:\\test");
        deleteDir(dir);
    }

    private static void deleteDir(File dir) {
        File[] files = dir.listFiles();
        /*
         * 递归的方式，遍历所有目录，删除文件。
         */
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory())
                    deleteDir(file);
                else
                    System.out.println("file :" + file.delete());
            }
        }
        System.out.println("dir:" + dir.delete());
    }
}
