package com.jayden.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by DaiLiang on 2017/2/21.
 */
public class ListDemo {
    /**
     * List 演示方法
     */
    public static void main(String[] args) {
        List l = new ArrayList();
        listMethod(l);
    }

    private static void listMethod(List l) {
//        1.添加元素
        l.add("abc1");
        l.add("abc2");
        l.add("abc3");
        l.add("abc4");

//        2.插入元素
        l.add(1, "soong");

//        3.删除元素
        l.remove(1);

//        4.查询元素
        System.out.println(l.get(3));
        System.out.println(l.indexOf("abc2"));

//        5.更改元素
        l.set(3, "abc5");

//        6.获取元素（遍历）

//        迭代方式：
        for(Iterator it = l.iterator(); it.hasNext();) {
            System.out.println("迭代：" + it.next());
        }

//        索引方式：
        for (int i = 0; i < l.size(); i++) {
            System.out.println("索引：" + l.get(i));
        }

//        System.out.println(l);
    }
}
