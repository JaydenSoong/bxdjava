package com.jayden.otherIO.print;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Created by DaiLiang on 2017/3/22.
 * PrintStream 演示
 */
public class PrintStreamDemo {
    public static void main(String[] args) throws IOException {
        File temp = new File("temple_files");
        if (!temp.exists())
            temp.mkdir();
//        1、创建 PrintStream 对象，目的就定为文件。
        PrintStream out = new PrintStream("temple_files\\print.txt");
//        2、将数据打印到文件中。
//        out.write(97); 字节流的 write() 方法，一次只写出一个字节也就是将一个整数的最低 8 位写出。
//        out.write("97".getBytes()); 麻烦
        out.print(97); //保证数值的表现形式，其实就是将数值转换成字符串。
        out.close();
    }
}
