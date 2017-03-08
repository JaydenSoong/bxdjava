package com.jayden.Map.Demo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by DaiLiang on 2017/3/8.
 * Map 演示，取出所有元素：values() 方法的使用
 */
public class MapDemo4 {
    public static void main(String[] args) {
        Map<String, String> JIGUAN = new HashMap<>();
        MapDemo2.baoming(JIGUAN);
//        新添加两个元素，演示值是可以重复的。
        JIGUAN.put("太上老君", "天庭");
        JIGUAN.put("卯日星官", "天庭");
        getAdr(JIGUAN);
    }

    private static void getAdr(Map<String, String> JIGUAN) {
        /**
         * values() 方法，将所有 Map 元素的值取出并存到 Collection 集合中返回。
         * 由于值是可以重复的，所以不能通过值获取键。
         */
        Collection<String> adr = JIGUAN.values();
        for (String str : adr) {
            System.out.println(str);
        }
    }
}
