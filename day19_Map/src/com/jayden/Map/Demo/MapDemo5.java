package com.jayden.Map.Demo;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by DaiLiang on 2017/3/8.
 * Map 演示——查表法
 */
public class MapDemo5 {
    public static void main(String[] args) {
        Map<String, String> weeks = new TreeMap<>();

        weeks.put("星期一", "Monday");
        weeks.put("星期二", "Tuesday");
        weeks.put("星期三", "Wednesday");
        weeks.put("星期四", "Tuesday");
        weeks.put("星期五", "Friday");
        weeks.put("星期六", "Saturday");
        weeks.put("星期日", "Sunday");

        String cnWeek = "星期三";
        System.out.println(weeks.get(cnWeek));
    }
}
