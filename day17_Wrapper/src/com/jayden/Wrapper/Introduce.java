package com.jayden.Wrapper;

/**
 * Created by DaiLiang on 2017/2/15.
 */
public class Introduce {

    public static void main(String[] args) {
        /*
         * 基本数据类型对象包装类。
         * 将基本数据值封装成了对象。
         * 好处：可以在对象中定义更多的属性和行为对基本数据进行操作。
         *
         * byte     ----->  Byte
         * short    ----->  Short
         * int      ----->  Integer
         * long     ----->  Long
         * float    ----->  Float
         * double   ----->  Double
         * boolean  ----->  Boolean
         * char     ----->  Character
         *
         * 基本数据类型对象包装的重要功能：在基本数据类型和String类型之间转换
         *
         */

        //应用举例：int的取值范围,int的二进制值。
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.toBinaryString(23));
    }
}
