/*
 多线程间的通信。多个线程都在处理同一个资源，但处理的任务却不一样。

 举例：生产者，消费者。

 等待唤醒机制
 wait():该方法可以让线程处于冻结状态，并将线程临时存储到线程池中。
 notify():唤醒指定线程池中的任意一个线程。
 notifyAll():唤醒指定线程池中的所有线程。

 */


//描述资源
class Res {
    private String name;
    private int num = 1;
    boolean flag;

    public synchronized void set(String name) {  //同步方法
        //拿到锁之后，判断标记
        if(flag)
            try{wait();} catch(InterruptedException e) {}
        this.name = name + "---" + num;
        num ++;
        System.out.println(Thread.currentThread().getName() + "...生产者..." + this.name);
        //生产者生产完成之后将标记改为true
        flag = true;
        //唤醒线程池中的一个线程
        notify();
    }

    public synchronized void get() {  //同步方法
        //拿到锁之后，判断标记
        if(!flag)
            try{wait();} catch(InterruptedException e) {}
        System.out.println(Thread.currentThread().getName() + "...消费者..." + this.name);
        //消费者生消费成之后将标记改为false
        flag = false;
        //唤醒线程池中的一个线程
        notify();
    }
}


//生产者
class Producer implements Runnable {
    private Res r;
    public Producer(Res r) {
        this.r = r;
    }
    public void run() { 
        while(true)
            r.set("面包");
    }
}


//消费者
class Consumer implements Runnable {
    private Res r;
    public Consumer(Res r) {
        this.r = r;
    }
    public void run() {
        while(true)
            r.get();
    }
}


public class ProducerConsumerDemo {
    public static void main (String[] args) {
        Res r = new Res();
        Producer p = new Producer(r);
        Consumer c = new Consumer(r);
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);
        t1.start();
        t2.start();
    }
}
