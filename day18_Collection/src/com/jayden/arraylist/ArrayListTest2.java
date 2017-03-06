package com.jayden.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

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
        singleArrayList_oop(al);
        System.out.println(al);
    }



    //    方式一
    //    循环嵌套的方式，删除相同元素
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

//    方式二
    public static void singleArrayList_oop(ArrayList al) {
//        1.创建临时容器
        ArrayList al2 = new ArrayList();
//        2.取出原容器中的元素
        for (Iterator iterator = al.iterator(); iterator.hasNext(); ) {
            Object next =  iterator.next();
//            3.若临时容器中没有取出的元素，则将其存入临时容器中，达到唯一
            if (!al2.contains(next)){
                al2.add(next);
            }
        }

//        4.清空原容器
        al.clear();
//        5.将临时容器中的元素放入原容器中。
        al.addAll(al2);
    }
}
