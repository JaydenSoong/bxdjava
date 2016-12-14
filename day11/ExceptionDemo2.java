/*
 * 异常的处理
 *
 * 两种：
 * 1.遇到问题不进行具体的处理，而是抛给调用者。就是在方法上通过 throws 关键字声明异常。告诉调用者处理。
 *
 *
 *
 */


class Demo {
    
    /*
     * 在编写功能时，编写者知道该功能有可能发生问题。而这个问题很容易来自于调用者传递的参数，而导致该功能无法运行。
     * 这时发生的问题就应该让调用者知道。并最好让调用都有预先的处理方式。所以在定义功能时，需要在功能上对有可能发生的问题进行声明。
     * 声明问题需要使用关键字。throws 异常类，声明的目的：让调用者可以处理。
     *
     */

    int div(int a, int b) throws Exception {
        return a / b;
    }
}


public class ExceptionDemo2 {
    
    public static void main (String[] args) throws Exception {
        
        int num;
        Demo d = new Demo();
        num = d.div(4, 0);
        System.out.println("num=" + num);
    }
}
