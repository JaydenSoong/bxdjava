package com.jayden.regex.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by DaiLiang on 2017/3/24.
 * 正则功能演示——获取
 */
public class Test04 {
    public static void main(String[] args) {
//        1、被查找的字符串
        String srcStr = "Today, I want to say: All of you are great.";
        System.out.println(srcStr);
//        2、查找规则
        String regex = "\\b[a-zA-Z]{3}\\b";

        /*
         * 指定为字符串的正则表达式必须首先被编译为此类的实例。然后，可将得到的模式用于创建 Matcher 对象，依照正则表达式，
         * 该对象可以与任意字符序列匹配。执行匹配所涉及的所有状态都驻留在匹配器中，所以多个匹配器可以共享同一模式。
         * 因此，典型的调用顺序是
         *
         * Pattern p = Pattern.compile("a*b");
         * Matcher m = p.matcher("aaaaab");
         * boolean b = m.matches();
         */

//        3、将指定为字符串的正则表达式编译为此类的实例。
        Pattern p = Pattern.compile(regex);
//        4、然后，可将得到的模式用于创建 Matcher 对象
        Matcher m = p.matcher(srcStr);

        /*
         * public boolean find()尝试查找与该模式匹配的输入序列的下一个子序列。 此方法从匹配器区域的开头开始，
         * 如果该方法的前一次调用成功了并且从那时开始匹配器没有被重置，则从以前匹配操作没有匹配的第一个字符开始。
         * 如果匹配成功，则可以通过 start、end 和 group 方法获取更多信息。
         */

//        5、调用 Matcher 的方法
        while (m.find()) {
            System.out.println(m.start() + ":" + m.group() + ":" + m.end());
        }
    }
}
