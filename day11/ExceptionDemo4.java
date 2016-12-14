/**
 * 异常的应用
 */


public class ExceptionDemo4 {
    
    public static void main (String[] args) {
        int[] arr = new int[3];
        arr = null;
        System.out.println(getElement(arr, -1));
    }

    //获取数组元素
    public static int getElement(int[] arr, int index) { // 运行时异常不需要声明
        if(arr == null)
            throw new NullPointerException("数组实体不存在！");
        if(index <0 || index >= arr.length)
            throw new ArrayIndexOutOfBoundsException("角标不存在！");
        int element = arr[index];
        return element;
    }
}
