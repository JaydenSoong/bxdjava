package com.jayden.reflect;

import com.jayden.reflect.entity.Person;

/**
 * Created by DaiLiang on 2017/3/29.
 * 反射技术
 */
public class ReflectDemo {
   /*
    * 反射技术：动态的获取类以及类中的成员，并可以调用该类成员
    * 没有反射技术的时候，有什么类，我们才能 new 什么对象。有了反射技术之后，可以获取类来 new 对象。
    *
    * 无论 new 什么对象，都需要先获取字节码文件。
    * 如何获取一个字节码文件的对象呢？
    * java 已经对字节码文件用 Class 进行了描述
    *
    * 方式一：Object 个体Class() 方法。
    *        在反射技术里，该方法不合适——反射技术不明确具体类。
    *
    * 方式二：所有的数据类型都有自己对应的 Class 对象，表示方式很简单。
    *        每一个数据类型都有一个默认的静态属性。 .class 用该属性就可以获取到字节码文件对象。
    *        虽然不用对象了，还是要用具体的类调用静态属性。
    * 方式三：在 Class 类中找到了 forName 方法，通过名称就可以获取对应的字节码文件。（重点）
    */
    public static void main(String[] args) {
        getClassMethod_1();
        getClassMethod_2();
        getClassMethod_3();
    }

    /**
     * 获取 Class 对象的方式三
     */
    private static void getClassMethod_3(){
        Class claz = null;
        try {
            claz = Class.forName("com.jayden.reflect.entity.Person");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(claz);
    }

    /**
     * 获取 Class 对象的方式二
     */
    private static void getClassMethod_2() {
        Class claz = Person.class;
        System.out.println(claz);
    }

    /**
     * 获取 Class 对象的方式一
     */
    private static void getClassMethod_1() {
        Person p1 = new Person();
        Class claz1 = p1.getClass();
        Person p2 = new Person();
        Class claz2 = p2.getClass();
        System.out.println(claz1 == claz2);
    }
}
