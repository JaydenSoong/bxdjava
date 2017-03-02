package com.jayden.arraylist;

import com.jayden.domain.Person;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by DaiLiang on 2017/3/2.
 */
public class ArrayListTest {
    /**
     * 练习1：往ArrayList中存储自定义对象，Person (name, age)。
     * 思路：
     *      1.描述Person
     *      2.定义容器对象。
     *      3.将多个Person对象存储到集合中。
     *      4.取出Person对象。
     */

    public static void main(String[] args) {
//        1.定义容器
        List lst = new ArrayList();

//        2.创建被存储的对象
        Person p1 = new Person("Zhao", 20);
        Person p2 = new Person("Qian", 30);

//        3.存储过程
        lst.add(p1);
        lst.add(p2);
        lst.add(new Person("Shun", 18));

//        4.迭代器方法取出对象
        for (Iterator iterator = lst.iterator(); iterator.hasNext(); ) {
            Person next = (Person) iterator.next();
//            System.out.println(next.toString());
            System.out.println(next.getName() + ":" + next.getAge());
        }
    }
}
