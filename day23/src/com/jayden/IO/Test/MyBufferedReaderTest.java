package com.jayden.IO.Test;

import com.jayden.IO.MyBufferedReader;
import com.jayden.IO.MyLineNumberReader;

import java.io.*;

/**
 * Created by SOONG on 2017/3/19.
 * 自定义缓冲区测试
 */
public class MyBufferedReaderTest {
    public static void main(String[] args) throws IOException {
        File file = new File("IO流_3.txt");
//        BufferedReader br = new BufferedReader(new FileReader(file));
//        String line;
//        while ((line = br.readLine()) != null) {
//            System.out.println(line);
//        }
//        br.close();
//        MyBufferedReader mbr = new MyBufferedReader(new FileReader(file));
        MyLineNumberReader mbr = new MyLineNumberReader(new FileReader(file));
        String line;
        while ((line = mbr.myReadline()) != null){
            System.out.println(mbr.getLineNum() + ":" +line);
        }
        mbr.myClose();
    }
}
