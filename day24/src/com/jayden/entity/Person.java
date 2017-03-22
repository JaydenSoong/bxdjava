package com.jayden.entity;

import java.io.Serializable;

/**
 * Person 类的对象如果需要序列化，就需要实现 Serializable 标记接口
 * 该接口给需要序列化的类，提供了一个序列版本号。serialVersionUID.
 * 该版本号的目的在于验证序列化的对象和对应类是否版本匹配。
 *
 * Created by DaiLiang on 2017/3/22.
 */
public class Person implements Serializable{
    // 给类显示声明一个序列版本号
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
