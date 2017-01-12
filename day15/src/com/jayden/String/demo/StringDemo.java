package com.jayden.String.demo;

/**
 * Created by DaiLiang on 2017/1/12.
 */
public class StringDemo {
    /*
       String演示
       "abcd"
       1.常量，一旦初始化就不会改变。

     */
    public static void main(String[] args){

        //--------------String是一个常量，一旦初始化就不会改变-------------
        String str = "abcd";
        str = "xyz";    //此时，改变的不是“abcd”，而是指向“abcd”的 str。
        System.out.println(str);

        //------------------------创建String的两种方式---------------------
        String s1 = "hello";
        String s2 = new String("hello");
        System.out.println(s1 == s2);       //结果为 false 比较的是两个对象的地址
        System.out.println(s1.equals(s2));  //结果为 true equals()方法比较的是两个对象的内容。
        /*
          s1 和 s2 的区别：
          1. s1 在内存中只有一个对象，在方法区的常量池中。
          2. s2 在内存中有两个对象，一个是方法区的常量池中的“hello”,另一个是String类的构造方法通过“hello”在堆内存中创建的对象。
         */

        //-------------------------String 对象的相等问题--------------------
        String s3 = "hello";
        System.out.println(s3 == s1); //结果是 true 在创建s3时，由于常量池中已经有了“hello”，所以直接引用。
    }
}