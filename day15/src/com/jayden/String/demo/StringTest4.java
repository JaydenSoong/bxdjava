package com.jayden.String.demo;

/**
 * Created by DaiLiang on 2017/2/14.
 */
public class StringTest4 {
    /*
    需求：找出两个字符串中包含的最大的相同子串。
          s1 = abcdloveefghijk;
          s2 = ikjlovea;
          最大相同子串为 love.
    思路：1.以短的字符串为主，到长的字符串中去判断，如果存在，已找到。
          2.如果没有找到，将短串的长度递减获取子串，到长串中去找，直到找到就结束。
          3.没有找到，说明没有相同的。
     */

    public static void main(String[] args){
        String s1 = "abcdloveefghijk";
        String s2 = "ikjlovea";
        String maxSubStr = getMaxSubStr(s1, s2);
        System.out.println(maxSubStr);
    }

    public static String getMaxSubStr(String s1, String s2){
        //1.确定长字符串与短字符串；
        String longStr, shortStr;
        longStr = s1.length() > s2.length() ? s1 : s2;
        shortStr = s1.equals(longStr) ? s2 : s1;

        //2.对短字符串进行操作，从中取子串到长字符串中进行判断，是否存在。
        for (int i = 0; i < shortStr.length(); i++) {
            for (int j = 0, k = shortStr.length() - i; k <= shortStr.length() ; j++, k++){
                String temp = shortStr.substring(j, k);
                if (longStr.contains(temp))
                    return temp;
            }
        }
        return null;
    }
}