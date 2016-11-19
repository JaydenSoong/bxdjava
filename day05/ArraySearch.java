/*
 * 数组的查找算法
 * 1.遍历查找算法，有序数组和无序数组均可用
 * 2.二分查找算法，只能用于有序数组
 */

public class ArraySearch {

    public static void main(String[] args){
        int[] arr = {12, 25, 33, 45, 46, 54, 63, 66, 75, 99};
        //调用遍历查找的方法
        int index = arrSearch(arr, 25);
        System.out.println(index);
        //调用二分查找的方法
        int indexb = binarySearch(arr, 55);
        System.out.println(indexb);
    }
    
    //遍历查找
    public static int arrSearch(int arr[], int key) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == key)
                return i;
        }
        return -1;
    }

    /*
     * 二分查找，对于有序数组，可以使用二分查找的方式
     * 原理：
     * 1.定义三个变量 min、 mid、 max 分别代表最小角标，中间角标，最大角标。
     * 2.让 mid = (min + max) >> 1。（右移一位，代表除以2。） 
     * 3.如果要查找的值 key 大于 arr[mid]， 则让 min = mid + 1, max 不变。继续查找
     * 4.如果要查找的值 key 小于 arr[mid]， 则让 max = mid - 1, min 不变。继续查找
     * 5.当 key == arr[mid] ,则返回 mid。
     * 6.当 max < min 时，代表要查找的不存在，返回 -1。
     */
    public static int binarySearch(int[] arr, int key) {
    
        int min = 0;
        int max = arr.length - 1;
        
        while(min <= max) {
            int mid = (min + max) >> 1;
            if(key > arr[mid]){
                min = mid + 1;
            } else if(key < arr[mid]) {
                max = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
