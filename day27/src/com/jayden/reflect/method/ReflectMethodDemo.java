package com.jayden.reflect.method;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by DaiLiang on 2017/3/29.
 * 反射技术 获取方法演示
 */
public class ReflectMethodDemo {
    public static void main(String[] args) {
        Class clax = getClassMethod();
        getMethod_1(clax);
        getMethod_2(clax);
        getMethod_3(clax);
    }

    //    获取非静态带参方法
    private static void getMethod_3(Class clax) {
        try {
            Method method = clax.getMethod("pramRun", String.class, int.class);
//            非静态方法，调用时要 new 对象
            Object obj = clax.newInstance();
            method.invoke(obj,"zhangsan",50);
        } catch (NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    //    获取静态空参方法
    private static void getMethod_2(Class clax) {
        try {
            Method method = clax.getMethod("staticRun",null);
//            静态方法不需要 new 对象
            method.invoke(null,null);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    private static Class getClassMethod() {
        try {
            return Class.forName("com.jayden.reflect.entity.Person");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

//    获取非静态空参方法
    private static void getMethod_1(Class clax) {
        try {
            Method method = clax.getMethod("run",null);
//            非静态方法，调用时要 new 对象
            Object obj = clax.newInstance();
            method.invoke(obj,null);
        } catch (NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
