package com.jayden.Generic.Comparator;

import com.jayden.Generic.domain.Person;

import java.util.Comparator;

/**
 * Created by DaiLiang on 2017/3/6.
 */
public class compareByName implements Comparator<Person>{

    public int compare(Person p1, Person p2){
        int temp = p1.getName().compareTo(p2.getName());
        return temp == 0 ? p1.getAge() - p2.getAge() : temp;
    }
}
