package com.jayden.String.demo;

import java.util.Arrays;

/**
 * Created by DaiLiang on 2017/2/14.
 */
public class StringTest5 {
    /**
     * 需求：对字符串中的字符进行自然顺序排序。
     * 思路：1.将字符串转为数组。
     *       2.对数组进行排序。
     *       3.将数组转为字符串。
     */

    public static void main(String[] args) {
        String s = "tanghumiddleschool";
        String sortStr = getToSortString(s);
        System.out.println("sortStr = " + sortStr);
    }

    public static String getToSortString(String s) {
        //1.将字符串转为数组。
        char[] chs = getStrToCharArr(s);

        //2.对数组进行排序。
        sort(chs);

        //3.将数组转为字符串。
        return new String(chs);
    }

    private static void sort(char[] chs) {
        Arrays.sort(chs);
    }

    private static char[] getStrToCharArr(String s) {
        return s.toCharArray();
    }
}