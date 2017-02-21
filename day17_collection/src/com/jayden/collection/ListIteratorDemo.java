package com.jayden.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by DaiLiang on 2017/2/21.
 */
public class ListIteratorDemo {
    /**
     * ListIterator 演示
     */
    public static void main(String[] args) {
        List list = new ArrayList();
        getListIteratorMethod(list);
    }

    private static void getListIteratorMethod(List list) {
//        1.添加元素
        list.add("abc1");
        list.add("abc2");
        list.add("abc3");
        list.add("abc4");

//        使用List集合特有的迭代器，ListIterator 通过List集合的方法 listIterator()获取该迭代器对象。
//        ListIterator可以实现迭代过程中的增删改查
        for (ListIterator it = list.listIterator(); it.hasNext(); ) {
            Object next = it.next();
            if (next.equals("abc2"))
                it.add("hehe");
        }

        System.out.println(list);
    }
}
