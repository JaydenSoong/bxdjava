package com.jayden.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by DaiLiang on 2017/2/21.
 */
public class CollectionDemo2 {

    /**
     *
     * 集合中带All的方法演示
     *
     */

    public static void main(String[] args) {
        collectionMethodAll();
    }

    private static void collectionMethodAll() {

        Collection c1 = new ArrayList();
        Collection c2 = new ArrayList();

        c1.add("a1");
        c1.add("a2");
        c1.add("a3");
        c1.add("a4");

        c2.add("a2");
        c2.add("a3");
        c2.add("a5");

//        1.addAll();
//        c1.addAll(c2);

//        2.containsAll();
//        System.out.println(c1.containsAll(c2));

//        3.removeAll();
//        c1.removeAll(c2);

//        4.retainAll(); 交集部分
        c1.retainAll(c2);

        System.out.println(c1);


    }
}
