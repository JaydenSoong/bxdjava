/*
验证同步方法的锁是this。

验证方法，开启两个线程：
一个用同步代码块，使用明锁。
另一个用同步方法，使用this锁。
两个线程执行同一个任务，若明锁使用this，结果正确，则说明同步方法是使用的this锁。

*/


class SaleTickets implements Runnable {
    private int tickets = 1000;
    boolean flag = true; //用于切换线程。

    public void run() {
        if(flag)
            while(true) {
                synchronized(this){ //同步代码块，指定其明锁为this
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

    public synchronized void sale() { //同步方法，不能明确指定锁，其锁是默认的this
        if(tickets > 0) {
            try {
                    Thread.sleep(10);
                } catch (InterruptedException e){
                }
                System.out.println(Thread.currentThread().getName() + "...func..." + tickets --);
        }
    }
}


public class ThisLockDemo {
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
