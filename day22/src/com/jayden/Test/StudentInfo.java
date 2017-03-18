package com.jayden.Test;

import com.jayden.Test.entity.Student;

import java.io.*;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by SOONG on 2017/3/18.
 * 对学生成绩进行排序的类
 */
public class StudentInfo {
    /**
     * 与下面的方法形成重载，此方法没有比较器
     * @return 学生对象的集合 set
     */
    public static Set<Student> getStudents() throws IOException {
        return getStudents(null);
    }

    /**
     * 与下面的方法形成重载，此方法需要比较器
     * @param comp 比较器对象。
     * @return 学生对象的集合 set
     */
    public static Set<Student> getStudents(Comparator<Student> comp) throws IOException {
//        1、键盘录入对象，此流不用特意关闭。因为 System.in System.out 是虚拟机最基本的两个资源。
        BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
//        2、创建学生容器 Set
        Set<Student> set = null;
        if (comp != null){
            set = new TreeSet<>(comp);
        } else {
            set = new TreeSet<>();
        }
//        3、键盘录入过程
        String line = null;
        while ((line = bufr.readLine()) != null) {
            /*
             * 键盘录入的结束标记
             */
            if ("over".equals(line)) {
                break;
            }
//            4、将录入的一行内容（String）利用 String 的方法，分割成一个字符串数组
            String[] str = line.split(",");
            Student stu = new Student(str[0],Integer.parseInt(str[1]),
                    Integer.parseInt(str[2]),
                    Integer.parseInt(str[3]));
            set.add(stu);
        }
        return set;
    }

    /**
     * 遍历学生对象集合，并将其写入文件
     * @param set 学生对象集合
     * @param destFile 写入的目标文件
     */
    public static void write2File(Set<Student> set, File destFile){
//        1、文件写入缓冲流对象
        BufferedWriter bufw = null;
        try {
            bufw = new BufferedWriter(new FileWriter(destFile));
//            2、遍历集合，并将其写入目标文件
            for (Student stu : set) {
                bufw.write("姓名：" + stu.getName() + "\t总分：" + stu.getSum());
                bufw.newLine();
                bufw.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufw != null) {
//                3、释放资源
                try {
                    bufw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
