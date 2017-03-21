package com.jayden.properties.Demo;

import java.util.Properties;
import java.util.Set;

/**
 * Created by DaiLiang on 2017/3/21.
 * Properties 方法演示
 */
public class PropertiesDemo {
    public static void main(String[] args) {
        propertiesMethodDemo();
    }

    private static void propertiesMethodDemo(){
//        1、创建 Properties 集合。
        Properties prop = new Properties();

//        2、用 Properties 的方法添加元素
        prop.setProperty("zhangsan", "21");
        prop.setProperty("lisi", "22");
        prop.setProperty("wangwu", "31");

//        将属性列表输出到指定的输出流。properties 的方法，一般用于调试。
        prop.list(System.out);
//        Properties 属于 Map 集合，要遍历元素，需得转为 Set 方可
        Set<String> set = prop.stringPropertyNames();
        for (String value : set){
            String key = prop.getProperty(value);
            System.out.println(value + "....." + key);
        }
    }
}
