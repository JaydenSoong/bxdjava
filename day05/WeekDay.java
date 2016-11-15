/*
 * 需求：输入一个整数，输出对应的星期
 */

public class WeekDay{
    public static void main(String[] args){
        System.out.println(weekday(5));
    }

    public static String weekday(int x){
        //判断输入的数据是否合法
        if(x<1 || x>7){
            throw new RuntimeException(x + " 没有对应的星期");
        }
        String[] week = {"", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六", "星期日"};
        return week[x];
    }
}
