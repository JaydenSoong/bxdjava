package com.jayden.regex.Test;

/**
 * Created by DaiLiang on 2017/3/24.
 * 正则练习
 * 将“我我我我.....我我我.要要要要..要..要要学...编编编编..编程”
 * 还原成“我要学编程”。
 */
public class Test05 {
    public static void main(String[] args) {
        String srcStr = "我我我我.....我我我.要要要要..要..要要学...编编编编..编程";
        String newStr = test(srcStr);
        System.out.println(newStr);
    }

    private static String test(String srcStr) {
//        1、使用替换，干掉 "."
        String temp = srcStr.replaceAll("\\.+", "");
//        2、使用替换，干掉叠词
        temp = temp.replaceAll("(.)\\1+", "$1");
        return temp;
    }
}
