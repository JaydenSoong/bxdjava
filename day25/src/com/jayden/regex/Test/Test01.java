package com.jayden.regex.Test;

/**
 * Created by DaiLiang on 2017/3/24.
 * 匹配功能演示
 */
public class Test01 {
    public static void main(String[] args) {
        /*
         * 校验手机号
         */
        String cell = "15980098238";
        String regex = "1[358]\\d{9}";
        boolean b = cell.matches(regex);
        System.out.println(cell + ":" + b);
    }
}
