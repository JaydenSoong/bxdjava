/*
死锁

场景一
同步嵌套

实际开发的时候，应避免死锁

*/


class SaleTickets implements Runnable {
    private int tickets = 1000;
    boolean flag = true; //用于切换线程。
    Object obj = new Object();

    public void run() {
        if(flag)
            while(true) {
                synchronized(obj){ // obj锁
                   sale(); //this锁，使得obj锁里有this锁
                }
            }
        else
            while(true)
                sale();
    }

    public synchronized void sale() { //同步方法，不能明确指定锁，其锁是默认的this
        synchronized(obj) { //obj锁，使得this锁里有obj锁，造成同步嵌套
            if(tickets > 0) {
                try {
                        Thread.sleep(10);
                    } catch (InterruptedException e){
                    }
                    System.out.println(Thread.currentThread().getName() + "...func..." + tickets --);
            }
        }
        
    }
}


public class DeadLockDemo {
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
