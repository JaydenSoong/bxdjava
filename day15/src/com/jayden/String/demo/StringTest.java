package com.jayden.String.demo;

/**
 * Created by DaiLiang on 2017/1/13.
 */
public class StringTest {
    @SuppressWarnings("InfiniteLoopStatement")
    public static void main(String[] args){
        String str = "I have a dream.";

        //1.通过字符串中指定位置获取对应的字符。
        char ch = str.charAt(5);
        System.out.println(ch);

        //2.获取指定字符在字符串中第一次出现的位置。
        int index = str.indexOf('a');
        System.out.println(index);

        //3.判断指定字符串在原字符串中是否出现，以及出现的位置。
        int index1 = str.indexOf("rx");
        System.out.println(index1);

        //4.字符串是否以指定字符串开头、结尾，是否包含指定字符串。
        boolean b1 = str.startsWith("i");
        System.out.println(b1);
        boolean b2 = str.endsWith("am.");
        System.out.println(b2);
        boolean b3 = str.contains("em");
        System.out.println(b3);

        //5.获取字符串中的一部分---子串。
        String subStr = str.substring(3,7);
        System.out.println(subStr);

        //6.将指定字符串中的指定字符修改为另一个字符。
        String str2 = str.replace('a', 'o');
        System.out.println(str2);

        //7.去除字符串两端的空白。
        String newStr = " I love you. ";
        String str3 = newStr.trim();
        System.out.println(str3);

        //8.字符串可以比较大小吗？如果有，将字符串数组排序。
        //字符串比较大小的方法：int compareTo(),按字典顺序。
        String[] strs = {"zhao", "qian", "sun", "li", "zhou"};
        printArr(strs);
        sort(strs);
        printArr(strs);
    }

    //字符串排序
    public static void sort(String[] strs) {
        for(int i = 0; i < strs.length - 1; i ++) {
            for (int j = i + 1; j < strs.length; j++) {
                swap(strs, i, j);
            }
        }
    }

    //交换两个字符串
    public static void swap(String[] strs, int i, int j) {
        if(strs[i].compareTo(strs[j]) > 0){
            String temp = strs[i];
            strs[i] = strs[j];
            strs[j] = temp;
        }
    }

    //遍历字符串方法
    public static void printArr(String[] strs) {
        for(int i = 0; i < strs.length; i ++){
            if(i != strs.length - 1)
                System.out.print(strs[i] + ", ");
            else
                System.out.println(strs[i]);
        }
    }
}