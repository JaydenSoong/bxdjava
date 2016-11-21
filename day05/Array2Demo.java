/*
 * 二维数组学习
 */

public class Array2Demo {

    public static void main(String[] args) {
        
        int[][] arr = new int[3][2];
        System.out.println(arr);//[[I@15db9742 二维数组实体，[[ 代表二维数组，I 代表 int 类型, @ 是分隔符。后面为16进制地址
        System.out.println(arr[0]);//[I@6d06d69c 一维数组实体。
        System.out.println(arr[0][0]);//0 一维数组元素。

        int[][] arr1 = new int[3][];
        System.out.println(arr1);//[I@6d06d69c 二维数组实体。
        System.out.println(arr1[0]);//null 未指定二维数组里的一维数组
        System.out.println(arr1[0][0]);//NullPointerException 空指针
    }
}
