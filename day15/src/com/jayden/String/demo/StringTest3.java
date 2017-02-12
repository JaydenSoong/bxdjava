package com.jayden.String.demo;

/**
 * Created by DaiLiang on 2017/2/12.
 */
public class StringTest3 {
    /*
       需求：查找字符串中子串出现的次数。
             String "nbaldkfajlknbalkfdnbakdkdknbauuinba"
             subString "nab"
     */

    public static void main(String[] args){
        String str = "nbaldkfajlknbalkfdnbakdkdknbauuinba";
        String key = "nba";
        System.out.println(count(str, key));
    }

    public static int count(String str, String key){
        //1.定义计数器。
        int num = 0;
        //2.定义查找位置。
        int index = 0;
        //3.使用循环查找。
        while ((index = str.indexOf(key,index)) != -1){
            num ++;
            index += key.length();
        }
        return num;
    }
}