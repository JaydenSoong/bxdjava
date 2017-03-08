package com.jayden.Map.Test;

import com.jayden.Map.Comparator.CompareByName;
import com.jayden.Map.domain.Student;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by DaiLiang on 2017/3/8.
 * 练习2：按照学生的年龄进行升序排序，并取出；按照学生的姓名进行排序，并取出。
 */
public class TreeMapTest {
    public static void main(String[] args) {
        TreeMap<Student, String> trm = new TreeMap<>(new CompareByName());

        trm.put(new Student("l李云龙", 40), "黑龙江");
        trm.put(new Student("z赵刚", 30), "北京");
        trm.put(new Student("c楚云飞", 38), "南京");
        trm.put(new Student("c楚云飞", 38), "重庆");
        trm.put(new Student("w魏和尚", 20), "河南");

        showStudent(trm);
    }

    private static void showStudent(TreeMap<Student, String> trm) {
        for(Map.Entry stu : trm.entrySet()) {
            System.out.println("学员：" + ((Student)stu.getKey()).getName() +"，年龄 " + ((Student)stu.getKey()).getAge() + "，来自 " + stu.getValue());
        }
    }
}
