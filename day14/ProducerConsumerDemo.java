/*
 解决多生产、多消费的效率问题

 使用了java.util.concurrent.locks包中的对象。
 Lock接口：它的出现比synchronized有更多的操作。
           lock():获取锁
           unlock()：释放锁
 同步代码块或同步方法的锁操作是隐式的。
 Lock接口，按照面向对象的思想，将锁单独封装成了一个对象。并提供了对锁的显示操作。
 Lock接口就是同步的替代。
 1.将线程中的同步更换为Lock接口的形式。
   替换运行失败了。因为wait没有了同步区域，没有了所属的同步锁。
   升级同步，其中的锁已经不是任意对象，而是Lock类型的对象。
   那么和任意对象绑定的监视器方法，是不是也升级了，有了专门和Lock类型锁的绑定的监视器方法呢？
   查问api。Condition接口替代了Object中的监视器方法。
   以前监视器方法封装到每一个对象中。
   现在将监视器方法封装到Condition对象中。
   方法名为 await signal signalAll

   监视器对象Condition如何和Lock绑定呢？
   可以通过Lock接口的newCondition()方法完成。

但是，问题依旧，一样唤醒了本方。效率依旧低。
解决问题：用两个监视器对象分别控制双方线程。

 */


import java.util.concurrent.locks.*;

//描述资源
class Res {
    private String name;
    private int num = 1;
    boolean flag;
    //创建新的Lock
    private Lock l = new ReentrantLock();
    //创建和Lock绑定的监视器对象
    private Condition producer_c = l.newCondition();
    private Condition consumer_c = l.newCondition();

    public void set(String name) {  //同步方法
        //拿到锁之后，判断标记
        l.lock();
        try {
            while(flag)
                try{producer_c.await();} catch(InterruptedException e) {}
            this.name = name + "---" + num;
            num ++;
            System.out.println(Thread.currentThread().getName() + "...生产者..." + this.name);
            //生产者生产完成之后将标记改为true
            flag = true;
            //生产完成后，唤醒对方的一个线程
            consumer_c.signal();
        } finally {
            l.unlock();
        }
    }

    public void get() {  //同步方法
        l.lock();
        try {
            //拿到锁之后，判断标记
            while(!flag)
                try{consumer_c.await();} catch(InterruptedException e) {}
            System.out.println(Thread.currentThread().getName() + "...消费者..." + this.name);
            //消费者生消费成之后将标记改为false
            flag = false;
            //消费完成后，唤醒对方的一个线程
            producer_c.signal();    
        } finally{
            l.unlock();
        }
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
        Thread t2 = new Thread(p);
        Thread t3 = new Thread(c);
        Thread t4 = new Thread(c);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
