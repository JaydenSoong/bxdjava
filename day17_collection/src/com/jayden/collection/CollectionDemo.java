package com.jayden.collection;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by DaiLiang on 2017/2/21.
 */
public class CollectionDemo {

    public static void main(String[] args) {

        Collection c = new ArrayList();

        collectionMethod(c);
    }

    private static void collectionMethod(Collection c) {
//        1.添加方法。

        c.add("abc1");
        c.add("abc2");
        c.add("abc3");
        c.add("abc4");

//        2.删除方法

        c.remove("abc3");
//        c.clear();

//        3.获取长度。

        System.out.println(c.size());

//        4.判断

        System.out.println(c.isEmpty());
        System.out.println(c.contains("abc3"));

        System.out.println(c);
    }


}
