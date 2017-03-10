package com.jayden.File.Test;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;

/**
 * Created by DaiLiang on 2017/3/10.
 * File 类的方法练习
 */
public class FileTest {
    public static final long TO_GB = 1024 * 1024 * 1024;
    public static void main(String[] args) throws IOException {
        /*
         * File 方法：
         * 1、获取文件的绝对路径
         */
        File f = new File("IO流.txt");
        String absolute_path = f.getAbsolutePath();
        System.out.println(absolute_path);

        /*
         * 2、获取文件的路径
         */
        String path = f.getPath();
        System.out.println(path);

        /*
         * 3、获取文件最后一次修改的时间，要求是x年x月x日 时间。
         */
        long last_mod = f.lastModified();
        String myString = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG).format(last_mod);
        System.out.println(myString);

        /*
         * 4、文件是否是隐藏的
         */
        boolean isHide = f.isHidden();
        System.out.println(isHide);

        /*
         * 5、发现 File 对象封装的文件可以是存在的，也可以是不存在的。那么不存在的可否用 File 的功能创建呢？
         *    创建功能
         *    public boolean createNewFile() throws IOException
         *    删除功能
         *    public boolean delete()
         */
        File file3 = new File("Hello.txt");
        boolean b = file3.createNewFile();
        System.out.println(b);
        boolean b2 = file3.delete();
        System.out.println(b2);

        /*
         * 6、一个 File 对象封装的对象是否存在呢？判断存在功能
         */
        File file1 = new File("2.txt");
        boolean isHere = file1.exists();
        System.out.println(isHere);

        /*
         * 7、getFreeSpace() 方法是什么意思呢？用 Demo 验证。getTotalSpace() getUsableSpace()
         *    分区剩余空间
         *    分区部空间
         *    分区可用空间
         */
        long freeSpace = f.getFreeSpace();
        System.out.println(freeSpace / TO_GB + "GB");

        long totalSpace = f.getTotalSpace();
        System.out.println(totalSpace / TO_GB + "GB");

        long usableSpace = f.getUsableSpace();
        System.out.println(usableSpace / TO_GB + "GB");

        /*
         * 8、获取指定文件夹中的文件和文件夹的名称。
         */
        File file2 = new File("G:\\bxdjava\\day21\\src\\com\\jayden\\File");
        File[] files = file2.listFiles();
        for (File f1 : files) {
            System.out.println(f1);
        }
    }
}
