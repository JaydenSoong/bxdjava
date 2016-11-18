/*
 * 用查表法将十进制的整数转换为十六进制的数
 */

public class HexTest1 {
    //程序主入口。
    public static void main(String[] args){
        System.out.println(toHex(2356));
    }

    //转换十六进制的方法
    public static String toHex(int num){
        //定义表
        char[] chs = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        //定义临时容器
        char[] arr = new char[8];
        //临时容器索引
        int index = arr.length;
        while(num != 0){
            //取出最低四位
            int tmp = num & 15;
            //查表找到最低四位代表的字符
            arr[--index] = chs[tmp];
            //无符号右移四位
            num = num >>> 4;
        }
        return "0x" + toString(arr, index);
    }

    //转字符串方法
    public static String toString(char[] arr, int index){
        String str = "";
        for(int i=index; i<arr.length; i++){
            str += arr[i];
        }
        return str;
    }
}
