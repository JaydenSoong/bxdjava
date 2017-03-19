package com.jayden.IO;

import java.io.IOException;
import java.io.Reader;

/**
 * Created by SOONG on 2017/3/18.
 * read() 方法缓冲区实现
 */
public class MyBufferedReader {
//    1、持有一个需要缓冲的对象
    private Reader r;
//    2、需要维护一个内部数组
    private char[] buffer = new char[1024];
//    3、对象初始化的时候就有被缓冲的对象
    public MyBufferedReader(Reader r) {
        this.r = r;
    }
//    4、定义角标
    private int pos = 0;
//    5、定义变量，记录数组元素的个数
    private int count = 0;

    /**
     * 定义一个读取字符的方法。
     * @return 一个字符
     * @throws IOException
     */
    public int myRead() throws IOException {
        if (count == 0){
//        通过被缓冲流的对象的 read() 方法，就可以将设备上的数据存储到数组中
            count = r.read(buffer);
            pos = 0;
        }
        if (count < 0)
            return -1;
        char ch = buffer[pos];
//        每取一次，角标都要自增
        pos ++;
//        每取一次，数组长度减一
        count --;
        return ch;
    }

    /**
     * 读取一行文本
     * @return 一行文本，即一个字符串
     * @throws IOException
     */
    public String myReadline() throws IOException {
//        1、定义临时缓冲区，用来存储一行文本
        StringBuilder sb = new StringBuilder();
//        2、不断调用 read() 方法，从缓冲区取出数据
        int ch;
        while ((ch = myRead()) != -1 ){
//            3、在存储前要判断行终止符
            if (ch == '\r')
                continue;
            if (ch == '\n')
                return sb.toString();
//            4、对读到的字符进行临时存储
            sb.append((char) ch);
        }
//        5、如果文本结尾处有数据，但没有结束符。数据已被读到，并存储到 StringBuilder 中，只要判断 StringBuilder 长即可
        if (sb.length() != 0){
            return sb.toString();
        }
        return null;
    }

    /**
     * 定义一个缓冲区的关闭方法
     * @throws IOException
     */
    public void myClose() throws IOException {
//        其实就是在关闭被缓冲的流对象
        r.close();
    }
}
