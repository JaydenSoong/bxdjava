package com.jayden.Test.entity;

/**
 * Created by SOONG on 2017/3/18.
 * 学生对象模型
 */
public class Student implements Comparable<Student>{
   private String name;
   private int cn, math, en, sum;

    public Student() {
    }

    public Student(String name, int cn, int math, int en) {
        this.name = name;
        this.cn = cn;
        this.math = math;
        this.en = en;
        this.sum = cn + math + en;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCn() {
        return cn;
    }

    public void setCn(int cn) {
        this.cn = cn;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEn() {
        return en;
    }

    public void setEn(int en) {
        this.en = en;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (sum != student.sum) return false;
        return name.equals(student.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + sum;
        return result;
    }

    @Override
    public int compareTo(Student o) {
        int result = sum - o.sum;
        return result == 0 ? name.compareTo(o.name) : result;
    }
}
