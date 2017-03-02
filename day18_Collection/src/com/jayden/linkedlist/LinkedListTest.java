package com.jayden.linkedlist;

import java.util.LinkedList;

/**
 * Created by DaiLiang on 2017/3/2.
 */
public class LinkedListTest {
    /**
     * 练习：通过LinkedList实现一个堆栈或队列数据结构。
     * 堆栈：First In Last Out(FILO)
     * 队列：First In First Out(FIFO)
     */

    public static void main(String[] args) {
//        1.创建队列对象
        MyStack stack = new MyStack();

//        2.添加元素
        stack.myAdd("abc1");
        stack.myAdd("abc2");
        stack.myAdd("abc3");
        stack.myAdd("abc4");

//        3.取出元素
        while (!stack.isNull())
            System.out.println(stack.myGet());
    }
}

class MyQueue {
//    1.持有LinkedList对象
    private LinkedList link;

//    2.对象初始化
    MyQueue(){
        link = new LinkedList();
    }

//    3.添加元素的方法
    public void myAdd(Object o){
        link.addFirst(o);
    }

//    4.获取元素的方法
    public Object myGet(){
        return  link.removeLast();
    }

//    5.判断是否为空
    public boolean isNull() {
       return link.isEmpty();
    }
}

class MyStack {
    //    1.持有LinkedList对象
    private LinkedList link;

    //    2.对象初始化
    MyStack() {
        link = new LinkedList();
    }

    //    3.添加元素的方法
    public void myAdd(Object o){
        link.addFirst(o);
    }

    //    4.获取元素的方法
    public Object myGet() {
      return link.removeFirst();
    }

    //    5.判断是否为空
    public boolean isNull() {
        return link.isEmpty();
    }
}
