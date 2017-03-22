package com.jayden.otherIO.Test;

/**
 * Created by SOONG on 2017/3/22.
 * 按字节数截取字符串
 */
public class IOTest02 {
    public static void main(String[] args) {
        String str = "abc长期deg以来";
        byte[] bytes = str.getBytes();
//        for (byte b : bytes) {
//            System.out.print(b + ",");
//        }
        for (int i = 1; i <= bytes.length; i++) {
            String temp = cutStringByCount(str, i);
            System.out.println("截取" + i + "个字节的字符串是：" + temp);
        }
    }

    private static String cutStringByCount(String str, int len) {
//        1、将字符串转成字节数组
        byte[] bytes = str.getBytes();

//        2、定义计数器，记录负数的个数
        int count = 0;
//        3、遍历字节数组，从截取长度的最后一个字节开始判断，并往回判断
        for (int i = len - 1; i >= 0; i --){
//        4、遍历过程中，只要是负数就开始计数
            if (bytes[i] < 0){
                count ++;
            } else {
                break;
            }
        }
//        5、对遍历后的值进行判断，连续三个负数，转成字符串。否则，舍弃最后的一个，或两个字节。
        if (count % 3 == 0){
            return new String(bytes, 0, len);
        } else if (count % 3 == 1) {
            return new String(bytes, 0 ,len - 1);
        } else {
            return new String(bytes, 0, len - 2);
        }
    }
}
