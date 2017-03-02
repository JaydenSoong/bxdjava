package com.jayden.linkedlist;

import java.util.LinkedList;

/**
 * Created by DaiLiang on 2017/3/2.
 */
public class LinkedListDemo {
    /**
     * 演示LinkedList的特有方法
     */

    public static void main(String[] args) {
//        1.创建LinkedList对象
        LinkedList link = new LinkedList();

//        2.添加元素
        link.addFirst("abc1");
        link.addFirst("abc2");
        link.addFirst("abc3");
        link.addFirst("abc4");

//        3.获取元素
//        System.out.println(link.getFirst());
//        System.out.println(link.getFirst());

//        4.删除元素----removeFirst()会删除元素，并返回删除的元素
//        System.out.println(link.removeFirst());

//        5.取出元素----利用removeFirs()或removeLast()。
        while (!(link.isEmpty()))
            System.out.println(link.removeFirst());
    }
}
