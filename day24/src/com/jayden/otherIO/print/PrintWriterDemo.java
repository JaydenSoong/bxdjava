package com.jayden.otherIO.print;

import java.io.*;

/**
 * Created by DaiLiang on 2017/3/22.
 * PrintWriter 演示
 */
public class PrintWriterDemo {

    public static void main(String[] args) throws IOException {
        printToUpperCase();
    }

    /**
     * 读取键盘录入，将数据转成大写打印到屏幕上。
     * @throws IOException
     */
    private static void printToUpperCase() throws IOException {
//        1、键盘录入
        BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));

//        2、定义目的
//        BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter pw = new PrintWriter(System.out,true); //true 参数，实现 println() 的自动刷新

//        改变目的文件，还想实现自动刷新
        pw = new PrintWriter(new BufferedWriter(new FileWriter("temple_files\\printWriter.txt")),true);

//        3、读一行，写一行，键盘录入一定要定义结束标记
        String line;
        while ((line = bufr.readLine()) != null) {
            if (line.equals("over"))
                break;
            pw.println(line.toUpperCase());
//            pw.flush();
        }
        pw.close();
//        bufr.close(); 不需要关闭键盘录入这种标准输入流，一旦关闭，后面获取不到。/
    }

}
