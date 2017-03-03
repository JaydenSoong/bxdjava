package com.jayden.set.treeset;

import com.jayden.domain.Students;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by DaiLiang on 2017/3/3.
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();

        set.add(new Students("zhangsan", 18));//java.lang.ClassCastException:
                                                           //因为学生要排序，就需要进行比较，而没有定义比较方法，无法完成排序。
                                                           //比较add中使用的是Comparable接口的比较方法。
        set.add(new Students("lisi", 20));
        set.add(new Students("wangwu", 16));
        set.add(new Students("zhangwu", 16));

        for (Iterator iterator = set.iterator(); iterator.hasNext(); ) {
            Students next = (Students) iterator.next();
            System.out.println(next);
        }
    }
}
