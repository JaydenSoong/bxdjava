package com.jayden.regex;

/**
 * Created by SOONG on 2017/3/23.
 * 正则表达式演示
 */
public class RegexDemo {
    public static void main(String[] args) {
        String QQ = "622256";
//        checkQQ(QQ);
        boolean b = QQ.matches("[1-9][0-9]{4,14}");
        System.out.println(QQ + ":" + b);
    }

    /**
     * 非正则演示，体验其繁琐
     *
     * 校验 QQ 号，5-15 位且只能是数字，不能以 0 开头。
     */
    private static boolean checkQQ(String QQ) {
        boolean b = false;
//        1、获取长度
        int length = QQ.length();
//        2、判断长度
        if(length >= 5 && length <= 15) {
//            3、校验开头字符
            if(!QQ.startsWith("0")){
//                4、校验是否纯数字
                try{
                    Long l = Long.parseLong(QQ);
                    b = true;
                    System.out.println(b + "：您输入的 QQ 号是：" + QQ);
                } catch(NumberFormatException e){
                    System.out.println(b + "：" + e);
                }
            } else {
                System.out.println(b + "：不能以 0 开头");
            }
        } else {
            System.out.println(b + "：QQ 号长度不对！");
        }
    
        return b;
    }
}
