package com.jayden.Generic.Demo;

import com.jayden.Generic.Comparator.compareByName;
import com.jayden.Generic.domain.Person;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by DaiLiang on 2017/3/6.
 */
public class GenericDemo3 {
    public static void main(String[] args) {
//        TreeSet<Person> set = new TreeSet<>(new compareByName());
        Set<Person> set = new HashSet<>();

        set.add(new Person("zhangsan", 22));
        set.add(new Person("lisi", 32));
        set.add(new Person("wangwu", 12));
        set.add(new Person("wangwu", 12));
        set.add(new Person("lisi", 42));
        for(Person p : set) {
            System.out.println(p);
        }
    }
}

