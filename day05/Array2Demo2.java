/*
 * 二维数组求和
 */

public class Array2Demo2 {
    
    public static void main(String[] args) {

        int[][] arr = {{25,23,22}, {33,29,46,47}, {58,89,78,12}};
        int sum = 0;

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                sum += arr[i][j];
            }
        }

        System.out.println(sum);
    }
}
