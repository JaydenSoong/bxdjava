package com.jayden.Generic.Demo;

import com.jayden.Generic.domain.Student;

/**
 * Created by DaiLiang on 2017/3/7.
 * 泛型类
 */
public class GenericDemo4 {
    public static void main(String[] args) {
        Util<Student> util = new Util<>();
        util.setO(new Student("Hanmeimei", 16));
        Student stu = util.getO();
        System.out.println(stu);
    }
}

/**
 * @param <E>
 *     泛型类。
 *     在类的定义时就明确参数。由使用该类的调用者，来传递具体类型。
 */
class Util<E> {
    private E o;

    E getO() {
        return o;
    }

    void setO(E o) {
        this.o = o;
    }
}
