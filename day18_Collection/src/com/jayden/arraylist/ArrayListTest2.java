package com.jayden.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by DaiLiang on 2017/3/2.
 */
public class ArrayListTest2 {
    /**
     * 练习2：定义功能，去除ArrayList中的重复元素
     */
    public static void main(String[] args) {
//        1.定义容器
        ArrayList al = new ArrayList();

//        2.添加元素
        al.add("abc1");
        al.add("abc2");
        al.add("abc3");
        al.add("abc1");
        al.add("abc2");
        al.add("abc3");
        al.add("abc2");
        al.add("abc3");

        System.out.println(al);
        singleArrayList(al);
        System.out.println(al);
    }

    private static void singleArrayList(ArrayList al) {
        for (int i = 0; i < al.size() - 1; i++) {
            Object o = al.get(i);
            for (int j = i + 1; j < al.size(); j++) {
                if (o.equals(al.get(j))) {
                    al.remove(j);
                    j --;
                }
            }
        }
    }
}
