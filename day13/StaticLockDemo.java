/*
如果同步方法被static修饰，其锁是类名。

static 方法随着类加载，这时不一定有该类的对象，但是一定有一个该类的字节码文件对象。
这个对象简单的表示方式就是 类名.class 

*/


class SaleTickets implements Runnable {
    private static int tickets = 100;
    boolean flag = true; //用于切换线程。

    public void run() {
        if(flag)
            while(true) {
                synchronized(SaleTickets.class){ //同步代码块，指定其明锁为类名
                    if(tickets > 0) {
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e){
                        }
                        System.out.println(Thread.currentThread().getName() + "...code..." + tickets --);
                    }
            
                }
            }
        else
            while(true)
                sale();
    }

    public static synchronized void sale() { //同步方法，不能明确指定锁，其锁是默认的this
        if(tickets > 0) {
            try {
                    Thread.sleep(10);
                } catch (InterruptedException e){
                }
                System.out.println(Thread.currentThread().getName() + "...func..." + tickets --);
        }
    }
}


public class StaticLockDemo {
    public static void main (String[] args) throws InterruptedException {
        SaleTickets st = new SaleTickets(); //线程任务
        Thread t1 = new Thread(st); //线程t1
        Thread t2 = new Thread(st); //线程t2
        t1.start(); //开启线程t1
        Thread.sleep(10); //将cpu的执行切换到t1
        st.flag = false;
        t2.start();
    }
}
