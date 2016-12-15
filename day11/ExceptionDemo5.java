/*
 * 在自定义的程序中，如果有了问题，也可以像 java 中的异常一样，对问题进行描述。
 * 
 * 举例：
 * 定义一个功能，可以实现除法运算。但是除数不能为负数。
 *
 */


public class ExceptionDemo5 {
    
    public static void main (String[] args) {
        System.out.println("num = " + div(4,-1));
    }

    //自定义除法功能
    public static int div (int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("除数不能为零！");
        }
        if (b < 0) {
            throw new MinusException("除数不能为负！");
        }
        return a / b;
    }
}


//自定义异常类
class MinusException extends RuntimeException {
    
    public MinusException (String message) {
        super(message);        
    }
}
