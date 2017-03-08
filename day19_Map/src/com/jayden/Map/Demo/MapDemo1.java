package com.jayden.Map.Demo;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by DaiLiang on 2017/3/8.
 * Map 演示
 */
public class MapDemo1 {
    public static void main(String[] args) {
        /**
         * Map 集合，存储键值对，如果键相同，会出现值覆盖。
         */
        Map<Integer, String> map = new HashMap<>();
        putMapElem(map);
        System.out.println(map);
//        get() 方法，取出元素
        System.out.println(map.get(1003));
        System.out.println(map);
//        remove() 方法，取出元素，并将其从 Map 中删除
        System.out.println(map.remove(1002));
        System.out.println(map);
//        值覆盖的情况, put() 方法，返回键的旧值
        System.out.println(map.put(1005, "《计算机学报》"));
        System.out.println(map.put(1005, "《网络技术》"));
        System.out.println(map);
    }

//    将添加元素的方法重构为方法
    private static void putMapElem(Map<Integer, String> map) {
        map.put(1001, "《疯狂 Java 讲义》");
        map.put(1002, "《细说 PHP》");
        map.put(1003, "《C# 入门》");
    }
}
