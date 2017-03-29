package com.jayden.reflect.field;

import java.lang.reflect.Field;

/**
 * Created by DaiLiang on 2017/3/29.
 * 反射技术获取字段演示
 */
public class ReflectFieldDemo {
    public static void main(String[] args) {
        getField();
    }

    private static void getField() {
        try {
            Class claz = Class.forName("com.jayden.reflect.entity.Person");

//            getField();只能获取公共成员字段
//            java.lang.NoSuchFieldException: age
//            Field field = claz.getField("age");

//            getDeclaredField(); 包括公共、保护、默认、和私有的
            Field field = claz.getDeclaredField("age");

//            获取到字段之后，想要对其进行操作
//            对没有权限访问的字段可以取消其权限控制
            Object obj = claz.newInstance();
            field.setAccessible(true);
            field.set(obj,35);

            System.out.println(field.get(obj));
        } catch (ClassNotFoundException | NoSuchFieldException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
    }
}
