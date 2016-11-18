/**
 * Created by Soong on 2016/11/18.
 * 需求：将一个给定的十进制整数转换十六进制
 * 思路：十六进制的数可以看成是二进制的数每四位一组。
 */
public class HexTest {

    //程序入口
    public static void main(String[] args){
        System.out.print(toHex(90));
    }

    //截取二进制的数，用数组保存
    public static String toHex(int num){

        //定义长度为 8 的数组，一个整数用二进制表示位数为 4*8=32 位
        char[] arr = new char[8];
        //数组索引
        int index = arr.length;
        //原理：一个数与 1 相与，取得有效为 1。
        //对是否进行与运算进行判断
        while (num != 0){
            //取得四位二进制数中的有效位 1。
            int temp = num & 15;
            //对取得的结果进行分析，用字母表示。
            if(temp > 9){
                arr[--index] = (char) (temp - 10 + 'A');
            } else {
                arr[--index] = (char) (temp + '0');
            }
            //无符号右移
            num = num >>> 4;
        }
        //返回字符串
        return "0x" + toString(arr, index);
    }

    //遍历数组，将其转为字符串
    public static String toString(char[] arr, int index){
        String str = "";
        for(int i=index; i< arr.length; i++){
            str += arr[i];
        }
        return str;
    }
}
