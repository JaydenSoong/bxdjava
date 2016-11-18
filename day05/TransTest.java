/*
 * 用查表法完成进制转换
 */

public class TransTest {
    //程序主入口。
    public static void main(String[] args){
        int num = 2545;
        String bin_str = trans(num, 1, 1);
        String oct_str = trans(num, 7, 3);
        String hex_str = trans(num, 15, 4);
        System.out.println(num + " 的二进制表示为：" + bin_str);
        System.out.println(num + " 的八进制表示为：" + oct_str);
        System.out.println(num + " 的十六进制表示为：" + hex_str);

    }

    //转换十六进制的方法
    public static String trans(int num, int base, int offset){
        //定义表
        char[] chs = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        //定义临时容器
        char[] arr = new char[32];
        //临时容器索引
        int index = arr.length;
        while(num != 0){
            //取出最低四位
            int tmp = num & base;
            //查表找到最低四位代表的字符
            arr[--index] = chs[tmp];
            //无符号右移四位
            num = num >>> offset;
        }
        return toString(arr, index);
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
