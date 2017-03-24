package com.jayden.regex.Test;

import java.util.Arrays;

/**
 * Created by DaiLiang on 2017/3/24.
 * 正则练习——ip 排序
 * “192.168.3.2    192.168.2.9  172.16.16.1     10.58.8.1          3.2.52.241”
 */
public class Test06 {
    public static void main(String[] args) {
        String ipStr = "192.168.3.2    192.168.2.9  172.16.16.1     10.58.8.1          3.2.52.241";
        test3(ipStr);
    }

    private static void test3(String ipStr) {
//        1、每个 IP 位前面加两个0
        String temp = ipStr.replaceAll("(\\d+)", "00$1");
//        2、保留每个 IP 位后面的三位数字
        temp = temp.replaceAll("0*(\\d{3})", "$1");
//        3、以空格分割字符串
        String[] strings = temp.split(" +");
//        4、对数组进行排序
        Arrays.sort(strings);
//        5、遍历数组
        for (String ips : strings) {
//            6、去掉 IP 位前面的"0"
            System.out.println(ips.replaceAll("0*(\\d)", "$1"));
        }
    }
}
