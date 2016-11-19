/*
 * 需求：选择排序
 */

public class ArrayTest {

    public static void main(String[] args){
        int[] arr = {23,25,12,3,56,89,1};
        printArr(arr);
        selectSort(arr);
        System.out.print("选择排序算法结果：");
        printArr(arr);
        int[] arr1 = {23,25,12,3,56,89,4};
        printArr(arr1);
        System.out.print("冒泡排序算法结果：");
        bubbleSort(arr1);
        printArr(arr1);
    }

    //选择排序的算法，大圈套小圈的思想，两层 for 循环
    public static void selectSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    //int temp = arr[i];
                    //arr[i] = arr[j];
                    //arr[j] = temp;
                    swap(arr, i, j);
                }
            }
        }
    }
    
    //冒泡排序的算法，大圈套小圈的思想，两层 for 循环
    public static void bubbleSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    //int temp = arr[j];
                    //arr[j] = arr[j+1];
                    //arr[j+1] = temp;
                    swap(arr, j, j+1);
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
    
    //置换部分可抽取出来，减少代码重复，提高利用性
    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] =  arr[b];
        arr[b] = temp;
    }
}
