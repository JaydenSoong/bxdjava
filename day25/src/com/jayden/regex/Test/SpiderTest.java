package com.jayden.regex.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by DaiLiang on 2017/3/24.
 * 网页爬虫小练习——抓取邮箱
 */
public class SpiderTest {
    public static void main(String[] args) throws IOException {
//        1、给出要被爬的文件
        File file = new File("temp_files\\spiderTest.html");
//        2、定义抓取条件（正则）
        String regex = "\\w+@\\w+(\\.\\w+)+";

        Set<String> set = spiderEmail(file,regex);
        for (String email : set) {
            System.out.println(email);
        }
    }

    private static Set<String> spiderEmail(File file, String regex) throws IOException {
        if(!file.exists()){
            throw new RuntimeException("文件不存在");
        }
        BufferedReader bufr = new BufferedReader(new FileReader(file));
        Set<String> set = new TreeSet<>();
        Pattern p = Pattern.compile(regex);
        String line;
        while ((line = bufr.readLine()) != null) {
            Matcher m = p.matcher(line);
            while (m.find()){
                set.add(m.group());
            }
        }
        return set;
    }
}
