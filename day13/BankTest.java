/*
 * 两个储户，到银行存钱，每人存了三次，一次100元。
 * 1.描述银行
 * 2.描述储户任务
 *
 * 分析多线程是否存在安全隐患
 * 1.线程任务中是否有共享的数据 
 * 2.是否多条操作共享数据的代码
 *
 */


/*
 *
 * 同步方法，其实就是在方法签名上加上同步关键字 synchronized 进行修饰。
 * 同步的表现形式有两种：1.同步代码块   2.同步方法
 * 同步方法使用的锁对象，就是 this。
 *
 */


class Bank {
    private int totalMoney;
    //同步代码块的锁，可以是任意对象
    private Object obj = new Object();

    //同步方法，在方法上加上synchronized修饰符
    public synchronized void saveMoney(int money) {
        //同步代码块，消除多线程安全隐患----操作共享数据的代码
        //synchronized(obj) {
            totalMoney += money;
            System.out.println("totalMoney = " + totalMoney);
        //}
    }
}


class Customer implements Runnable {
    private int money = 100;
    private Bank b = new Bank();

    //顾客存钱
    public void run() {
        for(int i=0; i<3; i++) {
            b.saveMoney(money);
        }    
    }
}


public class BankTest {
    public static void main (String[] args) {
        //多线程任务对象
        Customer cst = new Customer();
        //多条线程
        Thread td1 = new Thread(cst);
        Thread td2 = new Thread(cst);
        //开启多条线程
        td1.start();
        td2.start();
    }
}
