//需求：找出三个已知数中的最大值
//解决方式：两次三目运算，找出最大值

/*
 * 方法一：面向过程的思路
    class FindMax {
        public static void main(String[] args) {
            int a = 34, b = 45, c = 21, i, j;
            i = (a > b) ? a : b;
            j = (i > c) ? i : c;
            System.out.println("The max value is: " + j);
        }
    }
*/

//方法2：面向对象的方式解决
class FindMax {
    //定义找最大值的方法
    static int findmax(int a, int b, int c) {
        int temp, max;
        temp = (a > b) ? a : b;
        max = (temp > c) ? temp : c;
        return max;
    }
    //主方法，调用自定义找最大数方法
    public static void main(String[] args) {
        System.out.println("The max vlue is: " + findmax(34, 45, 21));
    }
}
