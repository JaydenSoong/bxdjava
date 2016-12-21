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


class Bank {
    private int totalMoney;
    private Object obj = new Object();

    public void saveMoney(int money) {
        //同步代码块，消除多线程安全隐患----操作共享数据的代码
        synchronized(obj) {
            totalMoney += money;
            System.out.println("totalMoney = " + totalMoney);
        }
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
