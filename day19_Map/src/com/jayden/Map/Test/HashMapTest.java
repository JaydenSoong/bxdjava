package com.jayden.Map.Test;

import com.jayden.Map.domain.Student;

import java.util.HashMap;

/**
 * Created by DaiLiang on 2017/3/8.
 * 练习1：将学生和籍贯存储到 HashMap 中。同姓名，同年龄视为同一个学生。
 * 需要覆盖学生的 hashCode(), equals()。
 */
public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Student, String> hsm = new HashMap<>();

        hsm.put(new Student("李云龙", 40), "黑龙江");
        hsm.put(new Student("赵刚", 30), "北京");
        hsm.put(new Student("楚云飞", 38), "南京");
        hsm.put(new Student("楚云飞", 38), "重庆");
        hsm.put(new Student("魏和尚", 20), "河南");

        showStudent(hsm);
    }

    private static void showStudent(HashMap<Student, String> hsm) {
        for(Student stu : hsm.keySet()) {
            System.out.println("学员：" + stu.getName() +"，年龄 " + stu.getAge() + "，来自 " + hsm.get(stu));
        }
    }
}
