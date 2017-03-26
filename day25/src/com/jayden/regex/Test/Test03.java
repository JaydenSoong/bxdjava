package com.jayden.regex.Test;

/**
 * Created by DaiLiang on 2017/3/24.
 * 正则功能演示——替换
 */
public class Test03 {
    public static void main(String[] args) {
        String str = "18980098238";
        String regex = "(\\d{3})\\d{4}(\\d{4})";
        String replacement = "$1****$2"; // $ 可以在多参数时，后面的参数可以通过 $ 编号的形式取到前一个参数的组。
        String str_new = str.replaceAll(regex, replacement);
        System.out.println(str_new);
    }

}
