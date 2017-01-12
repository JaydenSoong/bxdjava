package com.jayden.String.demo;

/**
 * Created by DaiLiang on 2017/1/12.
 */
public class StringDemo2 {
    public static void main(String[] args){
        /*
           “abcd”

           查阅API文档发现String类的构造方法可以将字节数组、字符数组构造成字符串的对象

           1.长度
                查表思路：①方法返回值是int类型
                          ②该方法没有参数
           2.获取指定位置字符
                查表思路：①方法返回值是char类型
                          ②该方法有一个int类型的参数
           3.获取字符所处的位置
                查表思路：①方法返回值是int类型
                          ②该方法有一个char类型的参数
         */

        String str = "Hello, world!";
        int len = str.length();
        char ch = str.charAt(10);
        int index = str.indexOf('o');

        System.out.println("字符串长度: " + len);
        System.out.println("第10个字符为: " + ch);
        System.out.println("第一个‘o’在: " + index + "处");
    }
}
