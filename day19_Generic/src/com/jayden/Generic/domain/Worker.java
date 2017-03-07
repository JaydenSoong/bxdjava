package com.jayden.Generic.domain;

/**
 * Created by DaiLiang on 2017/3/7.
 * Worker 类
 */
public class Worker extends Person {
    public Worker() {
    }

    public Worker(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Worker{} " + super.toString();
    }
}
