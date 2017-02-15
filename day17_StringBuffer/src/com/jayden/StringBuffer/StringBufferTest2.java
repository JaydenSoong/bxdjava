package com.jayden.StringBuffer;

/**
 * Created by DaiLiang on 2017/2/15.
 */
public class StringBufferTest2 {

    public static void main(String[] args) {
        /**
         * 要求：将int数组的元素转换为字符串，其格式为[12,25,36,55]。
         *
         */

//        定义int数组
        int[] iArr = {2, 5, 6, 89, 23, 21};

//        调用定义方法
        String str = getString(iArr);
        System.out.println(str);
    }

    private static String getString(int[] iArr) {
//        1.定义临时容器
        StringBuffer sb = new StringBuffer();

//        2.字符串的开头
        sb.append("[");
        for (int i = 0; i < iArr.length ; i++) {
            if (i != iArr.length - 1)
                sb.append(iArr[i]).append(",");
            else
                sb.append(iArr[i]).append("]");
        }

        return sb.toString();
    }
}

/*
  什么时候使用字符缓冲区？
  数据很多，个数无所谓确定，类型无所谓确定，只要最后转出字符串。就可以使用StringBuffer这个容器。

  使用的局限性
  1.必须最终转成字符串
  2.无法对存储的数据进行单独操作。因为存储进来的元素都变成了字符串。

 */