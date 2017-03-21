package com.jayden.properties.Test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by DaiLiang on 2017/3/21.
 * 练习：定义一个功能，记录程序运行的次数。运行 5 次后，给出提示，运行次数已到，请注册。
 */
public class Runtimes {
    public static void main(String[] args) throws IOException {
        if(checkTimes())
            run();
    }

    private static boolean checkTimes() throws IOException {
        boolean isRun = true;
//        1、定义配置文件,记录程序运行次数
        File configFile = new File("temp_files\\times.properties");
        if (!configFile.exists()){
            configFile.createNewFile();
        }

//        2、计数器
        int count = 0;
//        3、属性集
        Properties prop = new Properties();
//        4、定义流对象
        FileReader fr = new FileReader(configFile);
//        5、将流对象加载到集合中
        prop.load(fr);
//        6、获取键对应的次数
        String value = prop.getProperty("count");
        if (value != null) {
            count = Integer.parseInt(value);
            if(count >= 5) {
                System.out.println("试用次数已到，请注册！");
                isRun = false;
            }
        }
//        7、对取出的次数自增
        count ++;
//        8、将自增后的次数按键值对的方式，存入集合中
        prop.setProperty("count", Integer.toString(count));

//        9、定义输出流对象
        FileWriter fw = new FileWriter(configFile);
//        10、将集合存入流对象中
        prop.store(fw,"free uses times");
//        11、关流
        fr.close();
        fw.close();
        return isRun;
    }

    private static void run(){
        System.out.println("程序运行");
    }
}
