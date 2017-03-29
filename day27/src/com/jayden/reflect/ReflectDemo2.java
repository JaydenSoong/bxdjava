package com.jayden.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by DaiLiang on 2017/3/29.
 * 根据获取到的类的 Class 字节码文件 new 对象
 */
public class ReflectDemo2 {
    public static void main(String[] args) {
        getObject_1();
        getObject_2();
    }

    private static void getObject_1() {
        try {
//            根据给定的类名获取 Class 对象
            Class claz = Class.forName("com.jayden.reflect.entity.Person");
//            方式一、根据空参构造器 new 对象
//            创建一个 Person 对象，默认调用该类的空参构造器，一般被反射的类通常都有空参构造器
//            若没有空参构造器，该方法会引发 java.lang.InstantiationException
            Object obj =claz.newInstance();

       } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
    }

    private static void getObject_2() {
//        根据给定的类名获取 Class 对象
        try {
            Class claz = Class.forName("com.jayden.reflect.entity.Person");
//            方式二、根据带参数的构造器 new 对象
//            先获取构造器
            Constructor cons = claz.getConstructor(String.class, int.class);
//            通过构造器 new 对象
            Object o = cons.newInstance("zhangsan", 23);
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
