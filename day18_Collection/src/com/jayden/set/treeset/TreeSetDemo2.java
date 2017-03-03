package com.jayden.set.treeset;

import com.jayden.comparator.CompareByName;
import com.jayden.domain.Students;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by DaiLiang on 2017/3/3.
 */
public class TreeSetDemo2 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet(new CompareByName());

        set.add(new Students("zhangsan", 18));
        set.add(new Students("zhangsan", 19));
        set.add(new Students("lisi", 20));
        set.add(new Students("wangwu", 16));
        set.add(new Students("zhangwu", 16));

        for (Iterator iterator = set.iterator(); iterator.hasNext(); ) {
            Students next = (Students) iterator.next();
            System.out.println(next);
        }
    }
}
