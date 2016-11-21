/*
 * 数组反转练习
 */

public class ArrayReverse {

    public static void main(String[] args) {
        
        int[] arr = {21, 45, 12, 34, 54, 78};
        printArr(arr);
        reverse(arr);
        printArr(arr);
    }

    //反转功能的方法
    public static void reverse(int[] arr) {
        //首尾互换，故定义两个变量：start, end, 当 start < end。 可互换
        for(int start=0, end=arr.length-1; start<end; start++, end--){
            swap(arr, start, end);
        }
    }

    //交换位置的方法
    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void printArr(int[] arr) {

        //for...each 遍历
        for(int node : arr) {
            System.out.print(node + " ");
        }
        System.out.println();
    }
}
