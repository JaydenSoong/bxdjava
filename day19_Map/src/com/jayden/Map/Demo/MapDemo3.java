package com.jayden.Map.Demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by DaiLiang on 2017/3/8.
 * Map 演示3 —— 取出所有元素：entrySet() 方法的使用
 */
public class MapDemo3 {
    public static void main(String[] args) {
        Map<String, String> JIGUAN = new HashMap<>();
        MapDemo2.baoming(JIGUAN);
        showJIGUAN(JIGUAN);
    }

    private static void showJIGUAN(Map<String, String> JIGUAN) {
//        Map.entry 其实就是 Map 接口的一个内部接口。代表 Map 的映射关系。
        Set<Map.Entry<String,String>> set = JIGUAN.entrySet();
        for (Map.Entry en : set) {
            System.out.println("姓名：" + en.getKey() + "籍贯：" + en.getValue());
        }
    }
}


/**
 * Map.entry 结构。
 * 为区分，用 MyMap 代替 Map，MyEntry 代替 entry。
 */
interface MyMap<K, V> {
    public static interface MyEntry<E> {

    }
}