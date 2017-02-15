package com.jayden.StringBuffer;

/**
 * Created by DaiLiang on 2017/2/15.
 */
public class StringBuffer3 {

    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("hello");
        StringBuffer sb2 = new StringBuffer("java");
        test(sb1, sb2);
        System.out.println(sb1 + "..." + sb2); //将输出 hellojava...java
    }

    private static void test(StringBuffer sb1, StringBuffer sb2) {
        sb1.append(sb2);
        sb1 = sb2; //对结果不产生影响。
    }
}
