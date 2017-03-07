package com.jayden.Generic.Demo;

import com.jayden.Generic.domain.Person;

import java.util.*;

/**
 * Created by DaiLiang on 2017/3/7.
 * 通配符演示
 */
public class GenericDemo7 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("abc1");
        list.add("abc2");
        list.add("abc3");
        list.add("abc4");

        printCollection(list);

        Set<Integer> set = new TreeSet<>();
        set.add(2);
        set.add(3);
        set.add(4);

        printCollection(set);

        List<Person> list1 = new LinkedList<>();
        list1.add(new Person("zhao", 23));
        list1.add(new Person("qian", 24));
        list1.add(new Person("sun", 25));
        list1.add(new Person("li", 23));

        printCollection(list1);
    }

    private static void printCollection(Collection<?> coll) { // 在不明确具体类型的情况下，可以使用通配符来表示
        for (Iterator<?> it = coll.iterator(); it.hasNext(); ) {
            Object next =  it.next();
            System.out.println(next);
        }
        System.out.println("-----------------------------");
    }
}
