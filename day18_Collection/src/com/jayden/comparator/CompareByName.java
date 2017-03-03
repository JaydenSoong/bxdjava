package com.jayden.comparator;

import com.jayden.domain.Students;

import java.util.Comparator;

/**
 * Created by DaiLiang on 2017/3/3.
 */
public class CompareByName implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
         int temp = ((Students)o1).getName().compareTo(((Students)o2).getName());
         return temp == 0 ? ((Students)o1).getAge() - ((Students)o2).getAge() : temp;
    }
}
