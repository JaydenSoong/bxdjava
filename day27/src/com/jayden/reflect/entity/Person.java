package com.jayden.reflect.entity;

/**
 * Created by DaiLiang on 2017/3/29.
 * 演示反射技术用的 Per：wson 类
 */
public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void run(){
        System.out.println("Person run");
    }

    public static void staticRun(){
        System.out.println("Static Person run");
    }

    public void pramRun(String name, int age){
        System.out.println(name + "---------" + age + ": run");
    }
}
