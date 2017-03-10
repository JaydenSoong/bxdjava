package com.jayden.File.Demo;

import java.io.File;

/**
 * Created by DaiLiang on 2017/3/10.
 * 文件对象方法演示
 */
public class FileMethodDemo1 {
    public static void main(String[] args) {
        /*
         *  常用方法
         *  1、获取文件名。
         *     public String getName()
         *  2、获取文件大小
         *     public long length()
         *  3、获取文件完整路径
         *     public String getPath()
         *  4、获取文件上层目录
         *     public String getParent()
         *  5、获取分区的可用空间
         *     public long getFreeSpace()
         *  ......
         *
         */
        File f = new File("F:" + File.separator + "BaiduYunDownload" + File.separator +
                "day21_avi" + File.separator + "IO流" + File.separator + "02-IO流-File-构造&字段.avi");

        String file_name = f.getName();
        System.out.println(file_name);

        long file_size = f.length();
        System.out.println(file_size);

        String file_path = f.getPath();
        System.out.println(file_path);

        String file_parent = f.getParent();
        System.out.println(file_parent);

        long freeSpace = f.getFreeSpace();
        System.out.println(freeSpace / 1024 / 1024 / 1024 + "GB");
    }
}
