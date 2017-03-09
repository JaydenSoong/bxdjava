package com.jayden.Map.Test;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by DaiLiang on 2017/3/9.
 * 练习：查表法的应用。
 * 有一个字符串 “How are you? I'm fine, Thank you!”。统计各个字符出现的次数。格式为“h(2)a(4)o(3)......”。
 */
public class MapTest {
    public static void main(String[] args) {
        String str = "How are you? I'm fine, Thank you!";
        String newStr = getCharCount(str);
        System.out.println(newStr);
    }

    private static String getCharCount(String str) {
//        将字符串转为字符数组
        char[] cha = str.toCharArray();
//        定义 Map 集合表
        Map<Character, Integer> map = new TreeMap<>();
//        遍历字符数组，获取每一个字母
        for (char aCha : cha) {
            if (!(aCha >= 'a' && aCha <= 'z' || aCha >= 'A' && aCha <= 'Z'))
                continue;
            Integer num = map.get(aCha);
//            将遍历到的字符作为键去查表，获取值
            if (map.get(aCha) == null) {
                num = 1;
                map.put(aCha, num);
            } else {
                num++;
                map.put(aCha, num);
            }
        }

        return mapToString(map);
    }

    private static String mapToString(Map<Character, Integer> map) {
        Set<Character> set = map.keySet();
        StringBuilder sb = new StringBuilder();
        for (Character c : set) {
            sb.append(c).append("(").append(map.get(c)).append(")");
        }
        return sb.toString();
    }
}
