package com.jayden.Generic.Demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DaiLiang on 2017/3/6.
 */
public class GenericDemo {
    /**
     * 泛型演示
     */

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        
        list.add("java");
//        list.add('c');  编译时不能通过，因为类型不一致。
        list.add("3");

        for (String str : list) {
            System.out.println(str.length());
        }
    }
}
