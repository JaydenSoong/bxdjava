package com.jayden.regex.Test;

/**
 * Created by DaiLiang on 2017/3/24.
 * 正则练习——验证邮箱
 */
public class Test07 {
    public static void main(String[] args) {
        String email = "jiandomgsong@126.com";
        String regex = "\\w+@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,3}){1,3}"; //真正使用的时候，可在网上搜寻相关的正则
        boolean b = email.matches(regex);
        System.out.println(email + ":" + b);
    }
}
