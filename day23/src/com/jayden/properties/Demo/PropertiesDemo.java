package com.jayden.properties.Demo;

import java.io.*;
import java.util.Properties;
import java.util.Set;

/**
 * Created by DaiLiang on 2017/3/21.
 * Properties 方法演示
 */
public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
  //        1、创建 Properties 集合。
        Properties prop = new Properties();
        setProperties(prop);
//        propertiesMethodDemo(prop);
        propertiesStoreMethodDemo(prop);
        propertiesLoadMethodDemo();
    }

    private static void propertiesLoadMethodDemo() throws IOException {
        File configFile = new File("temp_files\\info.properties");
        FileReader fr = new FileReader(configFile);
        Properties prop = new Properties();
        prop.load(fr);
        prop.setProperty("zhangsan", "31");
        FileWriter fw = new FileWriter(configFile);
        prop.store(fw, "modify Zhangsan");
        fr.close();
        fw.close();
//        prop.list(System.out);
    }

    public static void setProperties(Properties prop) {
//        2、用 Properties 的方法添加元素
        prop.setProperty("zhangsan", "21");
        prop.setProperty("lisi", "22");
        prop.setProperty("wangwu", "31");

    }

    public static void propertiesStoreMethodDemo(Properties prop) throws IOException {
//        1、创建目录
        File dir = new File("temp_files");
        if (!dir.exists())
            dir.mkdir();
//        2、在指定目录创建输出流
        FileOutputStream fos = new FileOutputStream("temp_files\\info.properties");
//        3、调用 store() 方法
        prop.store(fos,"Properties Demo, Store() method");
//        4、关流
        fos.close();
    }

    public static void propertiesMethodDemo(Properties prop){
        setProperties(prop);
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
