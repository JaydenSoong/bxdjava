/**
 * 
 * 异常：java 程序在 运行 时期发生的不正常情况（问题）。
 *       java 按照面向对象的思想对不正常情况进行描述和对象的封装。
 *
 * 问题分两种：
 *       Error: 由系统底层发生的，告诉 jvm, jvm 告诉使用者。不做针对性处理，直接修改代码。
 *       Exception: jvm 发生，并告诉使用者，可以进行针对性的处理。
 *
 */


class ExceptionDemo {
    
    public static void main (String[] args) {
        int[] arr = new int[1];
        System.out.println(arr[1]); //ArrayIndexOutOfBoundsException

        int[] arr2 = new int[1024*1024*1000]; //OutOfMemoryError
    }
}
