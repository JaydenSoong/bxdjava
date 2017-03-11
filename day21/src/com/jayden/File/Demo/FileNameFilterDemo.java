package com.jayden.File.Demo;

import com.jayden.File.Filter.FilterByContains;
import com.jayden.File.Filter.FilterBySuffix;

import java.io.File;

/**
 * Created by DaiLiang on 2017/3/10.
 * 文件名过滤器的演示
 */
public class FileNameFilterDemo {
    public static void main(String[] args) {
        File f = new File("G:\\bxdjava\\day03");
        myGetFiles(f);
    }

    private static void myGetFiles(File f) {
//        String[] names = f.list(new FilterBySuffix());
//        String[] names = f.list();
//          String[] names = f.list(new FilterByContains("Test"));
        String[] names = f.list(new FilterBySuffix(".txt"));
        for (String name : names) {
            System.out.println(name);
        }
    }
}
