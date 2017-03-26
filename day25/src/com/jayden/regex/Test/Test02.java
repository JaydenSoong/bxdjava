package com.jayden.regex.Test;


/**
 * Created by DaiLiang on 2017/3/24.
 * 正则演示——切割
 */
public class Test02 {
    public static void main(String[] args) {
        /*
         * 1、空格分割，空格出现一次或多次
         */
        String str = "zhao    qian     shun li";
        String regex = " +";
        split(str, regex);

        /*
         * 2、圆点分割，圆点在正则中是有特殊含义的，代表任意字符。所以要转义
         */
        String str1 = "Tom.Jayden.Halin.Mike";
        String regex1 = "\\.";
        split(str1, regex1);

        /*
         * 3、叠字分割——正则中组的应用。
         *    为了实现规则利用，用（）将需要利用的规则封装，就是正则表达式中的组。第一组都有编号，从1开始。通过编号就可以复用
         *    对应组的规则内容。注意，编号必须用到组的后面。也就是先封装，再调用
         *    "."表示任意字符，括起来表示一组。1表示第一组（需要转义，因为1也是有含义的），"+"表示一次或多次。
         */
        String str2 = "Tom###JaydenSSSHalin                Mike";
        String regex2 = "(.)\\1+";
        split(str2, regex2);

    }

    private static void split(String str, String regex) {
        String[] strings = str.split(regex);
        for (String str1 : strings) {
            System.out.println("-" + str1 + "-");
        }
        System.out.println("--------");
    }
}
