package com.jayden.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by DaiLiang on 2017/2/21.
 */
public class IteratorDemo {

    public static void main(String[] args) {

        iteratorDemo();
    }

    private static void iteratorDemo() {
//        1.创建集合
        Collection c = new ArrayList();

        c.add("c1");
        c.add("c2");
        c.add("c3");
        c.add("c4");

//        2.用 for loop，用迭代器的方式取出元素。用到了Iterator接口的两个方法。haxNext(); next();
       for (Iterator it = c.iterator(); it.hasNext();) {
           System.out.println(it.next());
       }
    }
}
