package com.jayden.Generic.Demo;

/**
 * Created by DaiLiang on 2017/3/7.
 * 泛型接口。
 */
public class GenericDemo6 {
    public static void main(String[] args) {
        SubDemo sub = new SubDemo();
        sub.show("123");
    }
}


/**
 * @param <T>
 *     泛型接口 Inter
 */
interface Inter<T> {
    void show(T t);
}


/**
 * @param <T>
 *     泛型类 InterInplement 实现了Inter 接口
 */
class InterInplement<T> implements Inter<T> {
    @Override
    public void show(T i) {
        System.out.println(i);
    }
}


/**
 * 子类 SubDemo 继承了泛型类 InterInplement。
 */
class SubDemo extends InterInplement<String>{

}
