/*
 多生产、多消费问题

 问题1：
    重复生产、重复消费
    原因：经过分析发现，被唤醒的线程没有判断标记就开始工作了。导致了重复的生产和消费的发生。
    解决：被唤醒的线程必须判断标记。将原来的if语句，换为while即可。


 问题2：
    死锁：所有线程均处于冻结状态
    原因：本方线程在唤醒时，又一次唤醒了本方线程。而本方线程循环判断标记，又继续等待，而导致所有线程都等待了。
    解决：希望本方唤醒了对方线程，就可以解决。
          可以使用notifyAll()方法。

 */


//描述资源
class Res {
    private String name;
    private int num = 1;
    boolean flag;

    public synchronized void set(String name) {  //同步方法
        //拿到锁之后，判断标记
        while(flag)
            try{wait();} catch(InterruptedException e) {}
        this.name = name + "---" + num;
        num ++;
        System.out.println(Thread.currentThread().getName() + "...生产者..." + this.name);
        //生产者生产完成之后将标记改为true
        flag = true;
        //唤醒线程池中的一个线程
        notifyAll();
    }

    public synchronized void get() {  //同步方法
        //拿到锁之后，判断标记
        while(!flag)
            try{wait();} catch(InterruptedException e) {}
        System.out.println(Thread.currentThread().getName() + "...消费者..." + this.name);
        //消费者生消费成之后将标记改为false
        flag = false;
        //唤醒线程池中的一个线程
        notifyAll();
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


public class ProducerConsumerDemo2 {
    public static void main (String[] args) {
        Res r = new Res();
        Producer p = new Producer(r);
        Consumer c = new Consumer(r);
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(p);
        Thread t3 = new Thread(c);
        Thread t4 = new Thread(c);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
