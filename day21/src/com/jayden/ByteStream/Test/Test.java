package com.jayden.ByteStream.Test;

import com.jayden.ByteStream.Filter.FilterBySuffix;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by DaiLiang on 2017/3/14.
 * 获取一个想要的指定文件的集合，如获取 bxdjava 下的 .java 文件，存储到集合中。
 * 思路：
 *      递归、过滤器、集合。
 */
public class Test {
    public static void main(String[] args) {
//        1、指定目录
        File dir = new File("G:\\bxdjava");
//        2、定义集合
        List<File> list = new ArrayList<>();
//        3、定义过滤器
        FileFilter filter = new FilterBySuffix(".xml");

        getFiles(dir, list, filter);
        printList(list);
    }

    /**
     * 打印集合元素
     *
     * @param list 需要打印的集合
     */
    private static void printList(List<File> list) {
        for (File file : list) {
            System.out.println(file);
        }
    }

    /**
     * 获取满足指定条件的集合的方法
     *
     * @param dir 需要遍历的目录
     * @param list 存储符合条件的结果的集合
     * @param filter 自定义的过滤器
     */
    private static void getFiles(File dir, List<File> list, FileFilter filter) {
//        1、通过 listFiles() 方法，获取 dir 目录下的所有文件和子目录
        File[] files = dir.listFiles();

//        2、判断数组非空
        if (files != null) {
//            3、遍历该数组
            for (File file : files) {
//                4、判断是否是目录，如果是，则递归。若不是，则对文件进行过滤
                if (file.isDirectory())
                    getFiles(file,list,filter);
                else
                    if (filter.accept(file))
                        list.add(file);
            }
        }
    }
}