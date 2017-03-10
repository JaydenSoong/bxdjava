package com.jayden.File.Demo;

import java.io.File;

/**
 * Created by DaiLiang on 2017/3/10.
 * File 类演示
 */
public class FileDemo1 {
    public static void main(String[] args) {
        /*
         * 可以封装存在的目录，也可以封装不存在的目录。
         *
         * 构造方法1
         *     public File(String pathname)
         *     通过将给定路径名字符串转换为抽象路径名来创建一个新 File 实例。如果给定字符串是空字符串，那么结果是空抽象路径名。
         *
         */
        File file1 = new File("Hello.txt");

        /*
         * 构造方法2
         *     public File(String parent, String child)
         *     根据 parent 路径名字符串和 child 路径名字符串创建一个新 File 实例。
         */
        File file2 = new File("D:\\", "Hello.txt");

        /*
         * 构造方法3
         *     public File(File parent, String child)
         *     根据 parent 抽象路径名和 child 路径名字符串创建一个新 File 实例。
         */
        File dir = new File("F:\\");
        File file3 = new File(dir, "Hello.txt");

        /*
         * 文件分隔符：
         * Windows：\\
         * Unix：/
         * File 类提供静态方法获取系统默认文件符——可移植。
         * public static final String separator
         */
        File file4 = new File("G:" + File.separator + "ABC" + File.separator + "Hello.txt");
        System.out.println(file4);
    }
}
