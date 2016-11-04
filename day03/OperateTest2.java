//习题1：交换两个变量的值（不使用第三方变量）
//分析：技巧题：所用原理，一个数异或另一个数两次，结果仍是原来的数。
class OperateTest2 {
    
    public static void main(String[] args){
        int a = 4, b = 5;
        System.out.println("原  数：a=" + a + " b=" + b);
        a = a ^ b; // a = 4 ^ 5;
        b = a ^ b; // b = 4 ^ 5 ^ 5; b = 4;
        a = a ^ b; // a = 4 ^ 5 ^ 4; a = 5;
        System.out.println("交换后：a=" + a + " b=" + b);
    }
}
