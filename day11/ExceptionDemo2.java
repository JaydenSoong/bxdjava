/*
 * 异常的处理
 *
 * 两种：
 * 1.遇到问题不进行具体的处理，而是抛给调用者。就是在方法上通过 throws 关键字声明异常。告诉调用者处理。
 *
 * 2.针对性的处理方式：捕获！
 *
 * try {
      //有可能发生异常的代码  
   } catch(异常类 变量) {
      //处理异常的代码
   }
 *
 * throw 和 throws 的区别：
 * 1.位置不同。
 *   throws 用在方法上，后面跟异常类，可以跟多个。
 *   throw 用在方法内，后面跟异常对象。
 *
 * 2.功能不同。
 *   throw 用来声明异常，让调用者知道该功能有可能出现问题，并让调用者可以给出预先的处理方式。
 *   throws 抛出具体的问题对象，执行到throws功能就已经结束了，跳转到调用者。并将具体的问题对象也抛给调用者。
 *   throws 语句是独立存在的，下面不要定义其他语句，因为执行不到。
 *
 * 异常体系的特殊情况：
 * Exception
 *      |--Error
 *      |--Exception
 * 异常体系最大的特点就是体系中的类以及产生的对象，都具备可抛性。
 */


class Demo {
    
    /*
     * 在编写功能时，编写者知道该功能有可能发生问题。而这个问题很容易来自于调用者传递的参数，而导致该功能无法运行。
     * 这时发生的问题就应该让调用者知道。并最好让调用都有预先的处理方式。所以在定义功能时，需要在功能上对有可能发生的问题进行声明。
     * 声明问题需要使用关键字。throws 异常类，声明的目的：让调用者可以处理。
     */

    int div(int a, int b) throws Exception { //异常声明
        if(b == 0) 
            throw new ArithmeticException("除数不能为零！"); //抛出异常对象。
        return a / b;
    }
}


public class ExceptionDemo2 {
    
    public static void main (String[] args) /* throws Exception */ {
        
        int num;
        Demo d = new Demo();
        try {
            num = d.div(4, 0);
            System.out.println("num=" + num);
        } catch(Exception e) {
            System.out.println("有异常！"); //自定义输出语句。
            System.out.println(e.getMessage()); //异常信息。
            System.out.println(e.toString()); //异常名称 + 异常信息。
            e.printStackTrace(); //异常名称 + 异常信息 + 异常位置。jvm 默认处理异常的方式。
        }
    }
}
