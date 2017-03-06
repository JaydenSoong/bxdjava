package com.jayden.Generic.Demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DaiLiang on 2017/3/6.
 * 泛型演示2
 */
public class GnericDemo2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(5);
        int sum = 0;

        for (Integer i : list) {
            sum += i;   //整型对象自动拆箱
        }

        System.out.println(sum);
    }
}
