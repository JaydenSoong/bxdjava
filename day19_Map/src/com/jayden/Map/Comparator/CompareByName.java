package com.jayden.Map.Comparator;


import com.jayden.Map.domain.Student;

import java.util.Comparator;

/**
 * Created by DaiLiang on 2017/3/8.
 * 姓名排序比较器
 */
public class CompareByName implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int temp = o1.getName().compareTo(o2.getName());
        return temp == 0 ? o1.getAge() - o2.getAge() : temp;
    }
}
