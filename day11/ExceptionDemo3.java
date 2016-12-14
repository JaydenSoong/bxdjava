/*
 * 异常的原则：
 * 1.功能内部有异常通过 throw 抛出，功能上一定要通过 throws 声明。
 *   内部抛什么，功能上就声明什么。
 *   声明的目的就是为了让调用者处理，如果调用者不处理，编译失败。
 *
 * 2.特殊情况：
 *   当方法内通过 throw 抛出了 RuntimeException 及其子类的异常对象时，方法上可以不用 throws 声明。
 *
 * Exception分两种：
 * 1.编译时会被检测的异常。
 * 2.运行时异常（编译时不检测）。
 */


class Demo {
    
    int div(int a, int b) /* throws Exception */ {
        if(b == 0) {
            //throw new Exception("除数不能为零！");
            throw new ArithmeticException("除数不能为零！");
        }
        return a / b;    
    }
}


public class ExceptionDemo3 {
    public static void main (String[] args) {
        Demo d = new Demo();
        int num = d.div(5, 0);
        System.out.println("num = " + num);    
        System.out.println("Over");
    }
}
