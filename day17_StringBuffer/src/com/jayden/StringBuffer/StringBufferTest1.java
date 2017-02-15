package com.jayden.StringBuffer;

/**
 * Created by DaiLiang on 2017/2/15.
 */
public class StringBufferTest1 {
    /**
     *
     * 通过缓冲区， 将要打印的矩形组成元素 * 进行存储后，一次性返回。
     */

    public static void main(String[] args) {
        String rec = drawRec(7, 8);
        System.out.println(rec);
    }

    private static String drawRec(int x, int y) {
//        定义容器
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < x; i ++) {
            for (int j = 0; j < y; j ++) {
                sb.append("*");
            }
//            回车换行
            sb.append("\n");
        }

        return sb.toString();
    }
}
