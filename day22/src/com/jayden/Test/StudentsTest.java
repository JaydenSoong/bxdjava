package com.jayden.Test;

import com.jayden.Test.entity.Student;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;

/**
 * Created by SOONG on 2017/3/18.
 * 练习：通过键盘录入学生信息，其格式为：姓名，语文成绩，数学成绩，英语成绩。将学生信息写入到文件中。
 * 要求：按成绩由高到低排序。
 */
public class StudentsTest {
    public static void main(String[] args) throws IOException {
//        1、创建一个比较器
        Comparator comp = Collections.reverseOrder();
//        2、获得学生对象集合
        Set<Student> set = StudentInfo.getStudents(comp);
//        3、创建目标文件
        File destFile = new File("temp_files\\info_new");
//        4、写入文件
        StudentInfo.write2File(set,destFile);
    }
}
