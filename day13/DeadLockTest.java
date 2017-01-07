/*
 * 死锁测试
 */


class Task implements Runnable {
    boolean flag;
    
    public Task(boolean flag) {
        this.flag = flag;
    }

    public void run() {
        if(flag) {
            while(true) {
                synchronized(Lock.LOCKA) {
                    System.out.println("if...locka");
                    synchronized(Lock.LOCKB) {
                        System.out.println("if...lockb");
                    }
                }
            }
        } else {
            while(true) {
                synchronized(Lock.LOCKB) {
                    System.out.println("else...lockb");
                    synchronized(Lock.LOCKA) {
                        System.out.println("else...locka");
                    }
                }
            }
            
        }
    }
}


class Lock {
    public final static Object LOCKA = new Object(); 
    public final static Object LOCKB = new Object();
}


public class DeadLockTest {
    public static void main (String[] args) {
        Task t1 = new Task(true);
        Task t2 = new Task(false);
        new Thread(t1).start();
        new Thread(t2).start();
    }
}
