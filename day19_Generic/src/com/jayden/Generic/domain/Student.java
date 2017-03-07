package com.jayden.Generic.domain;

/**
 * Created by DaiLiang on 2017/3/7.
 */
public class Student extends Person {
    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Student{} " + super.toString();
    }
}
