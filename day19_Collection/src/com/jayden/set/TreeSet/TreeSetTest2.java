package com.jayden.set.TreeSet;

import com.jayden.comparator.CompareByLength;

import java.util.Comparator;

/**
 * Created by DaiLiang on 2017/3/6.
 */
public class TreeSetTest2 {
    /**
     * 练习：对多个字符串（可重复）按长度排序（由短到长）。
     * 思路：1.用比较器的方式。
     *       2.字符串长度——length。
     *       3.长度相同，按字符串自然排序
     *       4.容器选择，可重复，选 List 或数组。这里选数组。
     */

    public static void main(String[] args) {
        String[] str = {"heh", "hello", "haha", "a", "javadoc", "hello", "javadoc"};

        Comparator comp = new CompareByLength();

        for (int i = 0; i < str.length - 1; i++) {
            for (int j = 0; j < str.length; j++) {
//                if (str[i].compareTo(str[j]) < 0) {  //自然排序
                if (comp.compare(str[i], str[j]) < 0) { //长度排序
                    swap(str, i, j);
                }
            }
        }

        for (String stri : str) {
            System.out.println(stri);
        }
    }

    private static void swap(String[] str, int i, int j) {
        String temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }
}
