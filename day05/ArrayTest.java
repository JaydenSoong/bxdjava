/*
 * 需求：选择排序
 */

public class ArrayTest {

    public static void main(String[] args){
        int[] arr = {23,25,12,3,56,89,1};
        printArr(arr);
        selectSort(arr);
        printArr(arr);
    }

    //选择排序的算法，大圈套小圈的思想，两层 for 循环
    public static void selectSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    // for...each遍历数组并输出
    public static void printArr(int[] arr){
        for(int element:arr){
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
