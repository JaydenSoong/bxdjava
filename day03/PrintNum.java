//需求：打印如下三角形
//      54321
//      5432
//      543
//      54
//      5
//解决办法：嵌套循环
class PrintNum {
    public static void main(String[] args) {
        //第一行打印5个数，以后每一行少一个，打印5行
        for(int i=5; i>=1; i--){
            for(int j=0; j<i; j++){
                //注意：每一行都是从数字5开始打印的
                System.out.print(5 - j + " ");
            }
            //打印完一行之后换行
            System.out.println();
        }
    }
}
