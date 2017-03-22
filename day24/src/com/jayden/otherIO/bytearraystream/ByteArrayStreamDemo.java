package com.jayden.otherIO.bytearraystream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/**
 * Created by SOONG on 2017/3/22.
 * ByteArrayStream 演示
 */
public class ByteArrayStreamDemo {
    public static void main(String[] args) {
//        用 IO 读写的思想来操作数组
//        1、确定源
        ByteArrayInputStream bais = new ByteArrayInputStream("abcd".getBytes());

//        2、确定目的。内置了一个 byte 数组
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int len;
        while ((len = bais.read()) != -1) {
            baos.write(len);
        }
        System.out.println(baos.toString());
    }
}
