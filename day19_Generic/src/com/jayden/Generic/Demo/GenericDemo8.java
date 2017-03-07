package com.jayden.Generic.Demo;

import com.jayden.Generic.domain.Person;
import com.jayden.Generic.domain.Student;
import com.jayden.Generic.domain.Worker;

import java.util.*;

/**
 * Created by DaiLiang on 2017/3/7.
 * 通配符限定
 */
public class GenericDemo8 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Zhao",12));
        list.add(new Student("Qian",13));
        list.add(new Student("Shun",14));

        printPerson(list);

        Set<Worker> set = new TreeSet<>();
        set.add(new Worker("Zhao",22));
        set.add(new Worker("Qian",33));
        set.add(new Worker("Shun",44));

        printPerson(set);
    }

    /**
     * 泛型的限定
     * ? extends E: 接收 E 类型或 E 类型的子类
     * ? super E: 接收 E 类型或 E 类型的父类
     */
    private static void printPerson(Collection<? extends Person> coll) { //泛型限定
        for (Person next : coll) {
            System.out.println(next);
        }
    }
}
