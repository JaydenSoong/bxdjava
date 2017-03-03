package com.jayden.domain;

/**
 * Created by DaiLiang on 2017/3/3.
 */
public class Students implements Comparable {
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

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /**
     * 学生就具有了比较功能，该功能是自然排序所使用的方法。
     * 以年龄的升序排序为主。
     */
    @Override
    public int compareTo(Object o) {
        if (this.age > ((Students) o).age)
            return 1;
        if (this.age < ((Students) o).age)
            return -1;
        return 0;
    }
}
