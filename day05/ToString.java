/*
 * 需求：将数组转为字符串
 * 知识点：字符串与任何数据相加都是相连接。
 */

public class ToString{
    
    public static void main(String[] args){
        int[] arr = new int[]{12,21,36,99,14,55,77};
        String result = arrToString(arr);
        System.out.println(result);
    }

    public static String arrToString(int[] arr){

        String str = "[";

        //遍历数组
        for(int x=0; x<arr.length; x++){
            if(x != (arr.length - 1)){
                str = str + arr[x] + ", ";
            } else{
                str = str + arr[x] + "]";
            }
        }
        
        return str;
    }
}
