//习题1：最有效率的计算3*8。
//分析：技巧题,8是2的3次幂。一个数乘以2的几次幂，就是左移几位。
class OperateTest {
    
    public static void main(String[] args){
        System.out.println(3 << 3);
    }
}
