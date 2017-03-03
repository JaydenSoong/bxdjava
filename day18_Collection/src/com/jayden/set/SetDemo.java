package com.jayden.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by DaiLiang on 2017/3/3.
 */
public class SetDemo {
    public static void main(String[] args) {
//        1.创建容器
        Set set = new HashSet();

//        2.添加元素
        set.add("haha");
        set.add("heihei");
        set.add("hi");
        set.add("hello");

//        3.取出元素
        for (Iterator iterator = set.iterator(); iterator.hasNext(); ) {
            Object next = iterator.next();
            System.out.println(next);
        }
    }
}
