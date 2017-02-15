package com.jayden.StringBuffer;

/**
 * Created by DaiLiang on 2017/2/15.
 */
public class StringBufferDemo1 {
    /**
     * 缓冲区对象的常见方法：
     * 1.添加元素
     *   append()：追加
     *   insert()：插入
     * 2.删除元素
     *   delete()：删除多元素
     *   deleteCharAt()：删除指定位置元素
     * 3.更改元素
     *   replace()：更改多元素
     *   setCharAt()：更改指定位置元素
     * 4.查询元素
     *   indexOf()
     * 5.反转
     *   reverse()
     * 6.设置长度
     *
     */

    public static void main(String[] args) {

//        1.创建StringBuffer对象。
        StringBuffer sb = new StringBuffer();

//        2.添加元素——追加字符串。(将输出abc)
        sb.append("abc");

//        3.添加元素——插入数据。(将输出atruebc)
        sb.insert(1,true);

//        4.删除元素。(包含开头，不包含结尾。将输出aebc)
        sb.delete(1,4);

//        5.删除指定位置元素。(将输出abc)
        sb.deleteCharAt(1);

//        6.更改元素 (将输出afalse)
        sb.replace(1, 5, "false");

//        7.更改指定位置元素 (将输出bfalse)
        sb.setCharAt(0, 'b');

//        8.查询元素
        System.out.println(sb.indexOf("ls"));

//        9.反转
        sb.reverse();

//        10.设置长度
        sb.setLength(3);

//        println()、print()方法，会将所有要打印的数据转换为字符串，通过自动调用toString()方法。
        System.out.println(sb);
    }
}
