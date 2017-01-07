/*
 
 单例设计模式的并发访问问题

 */

//饿汉式-----相对安全
class Single {
    private static final Single SINGLE_INSTANCE = new Single();
    private Single() {
    }
    public static Single getInstance() {
        return SINGLE_INSTANCE;
    }
}


//懒汉式（延迟加载方式）
/*
 在多线程并发访问时，会出现线程安全问题。
 加了同步就可以解决问题。无论是同步方法，还是同步代码块都行。但是，会降低效率。

 可以通过if对单例对象进行双重判断解决效率问题。
*/

class Single {
    private static Single s = null;
    private Single() {
    }
    public static Single getInstance() {
        if(s == null) {
            synchronized(Single.class){
                if(s == null)
                    s = new Single();
            }
        }
        return s;
    }
}


//多线程
class Demo implements Runnable {
    public void run() {
        Single.getInstance();
    }
}


public class ThreadSingleDemo {
    public static void main (String[] args) {
    
    }
}
