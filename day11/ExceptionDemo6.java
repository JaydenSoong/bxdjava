/*
 * try 语句的完整形式
 *
 * try {
 *    //语句
 * } catch {
 *    //语句
 * } finally {
 *    //语句
 * }
 *
 * finally 的作用：无论是否有异常发生，都要对资源进行释放。
 * 资源释放的动作就定义在 finally 中。
 *
 * finally 一定会被执行。
 *
 */


public class ExceptionDemo6 {
    
    public static void main (String[] args) {
        
        try {
            int num = 4 / 0;
            System.out.println("num = " + num);
        } catch(Exception e) {
            System.out.println(e.toString());
            //退出 jvm, 只有这种情况，finally 不会被执行。
            //System.exit(0);
        } finally {
            System.out.println("finally");
        }
    }
}
