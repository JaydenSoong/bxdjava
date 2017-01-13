package com.jayden.String.demo;

/**
 * Created by DaiLiang on 2017/1/13.
 */
public class StringTest2 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "java";
        test(s1,s2);
        System.out.print(s1 + "..." + s2);
    }

    public static void test(String s1, String s2){
        s2.replace('a', 'o');
        s1 = s2;
    }
}
