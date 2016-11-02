//定义ChenFaBiao类
class ChengFaBiao {
    public static void main(String[] args) {
        //声明用于循环的变量i, j
        int i, j;
        //嵌套循环，用于打印乘法表
        for(i=1; i<=9; i++) {
            for(j=1; j<=i; j++) {
                //打印乘法表的一行
                System.out.print(i + "*" + j+ "=" + i*j + "\t");
            }
            //换行打印
            System.out.println();
        }
    }
}