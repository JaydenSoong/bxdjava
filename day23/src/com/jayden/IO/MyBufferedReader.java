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
}
