package com.jayden.set.hashset;

import com.jayden.domain.Students;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by DaiLiang on 2017/3/3.
 */
public class HashSetTest {
    /**
     * 练习：往HashSet中存储自定义的学生对象（姓名，年龄）。同姓名，同年龄视为同一个人，不存。
     * 思路：1.描述学生
     *       2.定义容器
     *       3.添加自定义元素
     *       4.取出元素。
     */

    public static void main(String[] args) {
//        定义容器
        HashSet hashSet = new HashSet();

//        添加自定义元素
        hashSet.add(new Students("zhangsan", 18));
        hashSet.add(new Students("lisi", 20));
        hashSet.add(new Students("zhangsan", 18));
        hashSet.add(new Students("lisi", 20));
        hashSet.add(new Students("wangwu", 18));

//        取出元素
        for (Iterator iterator = hashSet.iterator(); iterator.hasNext(); ) {
            Students next = (Students) iterator.next();
            System.out.println(next);
        }
    }
}
