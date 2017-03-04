package com.jayden.set.TreeSet;

import com.jayden.comparator.CompareByLength;

import java.util.TreeSet;

/**
 * Created by DaiLiang on 2017/3/4.
 */
public class TreeSetTest1 {
    /**
     * 练习：对多个字符串（不得利）按长度排序（由短到长）。
     * 思路：1.用比较器的方式。
     *       2.字符串长度——length。
     *       3.长度相同，按字符串自然排序
     */

    public static void main(String[] args) {
//        1.用比较器的方式构造TreeSet对象，使其具有比较功能。
        TreeSet tSet = new TreeSet(new CompareByLength());

//        2.添加元素。
        tSet.add("abc");
        tSet.add("acb");
        tSet.add("abc");
        tSet.add("bcde");
        tSet.add("ca");
        tSet.add("bcde");
        tSet.add("ca");

//        3.foreach方式取出元素。
        for (Object str : tSet) {
            System.out.println(str);
        }
    }
}
