/*
 * 需求：输入一个十进制整数，将之转为十六进制
 * 思路：十六进制可以看成是二进制数每四位一组：
 *       1.将原二进制数与 1111 所代表的 15 相与，取到第一个二进制数
 *       2.将剩下的数右移，再与 15 相与，取到第二个进制数
 *       3.循环8次，取完（整数在计算机里表示位 4*8 = 32 位二进制数）
 */

public class HexTest {

    //程序入口，mian() 方法。
    public static void main(String[] args){
        toHex(26);
    }
    
    //转十六进制的方法
    public static void toHex(int num){
        //限定循环次数
        for(int i=0; i<8; i++){
            int temp = num & 15;
            //将取得结果大于 9 的转为字母，其余原样保留
            if(temp > 9){
                System.out.print((char)(temp - 10 + 'A') + " ");
            } else {
                System.out.print(temp + " ");
            }
            //无符号右移
            num = num >>> 4;
        }
    }
}
