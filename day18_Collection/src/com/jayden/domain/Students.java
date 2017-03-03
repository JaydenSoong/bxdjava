package com.jayden.domain;

/**
 * Created by DaiLiang on 2017/3/3.
 */
public class Students {
    private String name;
    private int age;

    public Students() {
    }

    public Students(String name, int age) {
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

    /**
     * Students 的 hashCode() 方法
     */

    @Override
    public int hashCode() {
        final int NUM = 31;
        return this.name.hashCode() + this.age * NUM;
    }

    /**
     * Students 的 equals() 方法
     */


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Students)){
            throw new ClassCastException("类型错误！");
        }

        return this.name.equals(((Students) obj).name) && this.age == ((Students) obj).age;
    }
}
