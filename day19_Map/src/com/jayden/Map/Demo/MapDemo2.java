package com.jayden.Map.Demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by DaiLiang on 2017/3/8.
 * Map 演示——取出所有元素：keySet() 方法的使用
 */
public class MapDemo2 {
    public static void main(String[] args) {
        Map<String, String> jiguan = new HashMap<>();
        baoming(jiguan);
        showJiGuan(jiguan);
    }

    private static void baoming(Map<String, String> jiguan) {
        jiguan.put("孙悟空", "花果山，水帘洞");
        jiguan.put("猪八戒", "高老庄");
        jiguan.put("沙悟净", "流沙河");
    }

    /**
     * keySet() 方法，取出所有的键，并放到 Set 集合中。
     * Map 集合没有迭代器，有了 keySet() 方法，就可以使用迭代器了。
     */
    private static void showJiGuan(Map<String, String> jiguan) {
        Set<String> name = jiguan.keySet();
        for (String key : name) {
            String adr = jiguan.get(key);
            System.out.println("姓名：" + key + "，籍贯：" + adr);
        }
    }
}
