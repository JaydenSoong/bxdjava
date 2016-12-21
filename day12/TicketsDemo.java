/*
 * 创建线程的第二种方式----实现Runnable接口
 *
 * 1.定义一个类实现Runnable接口
 * 2.覆盖Runnable接口中的run方法，将线程要运行的任务代码存储到该方法中
 * 3.通过Thread类创建线程对象，并将实现了Runnable接口的对象作为Thread类的构造方法的参数进行传递。
 * 4.调用Thread类的start方法，开启线程。
 *
 */


/*
 * 实现Runnable接口的好处
 * 1.避免了继承Thread类的单继承的局限性。
 * 2.Runnable接口出现更符合面向对象，将线程单独进行线程的封装。
 * 3.Runnable接口降低了线程对象和线程任务的耦合性。
 * 所以，创建线程对象，都应采用第二种方式
 *
 */


/*
 * 多线程的安全问题
 *
 * 产生原因：
 * 1.线程任务中有处理到共享数据。
 * 2.线程任务中有多条对共享数据的操作。
 * 一个线程在操作共享数据的过程中，其他线程参与了运算，造成了数据的错误。
 *
 * 解决思想：
 * 只要保证多条操作共享数据的代码在某一时间段，被一条线程所执行，在执行期间不允许线程参与运算。
 *
 * 代码体现
 * 用同步代码块
 *
 * synchronized(对象) { //任意对象皆可
 *      //需要被同步的代码，注意，一定是需要同步的代码，操作了共享数据的代码。不要什么都同步
 * }
 *
 * 同步在目前情况下，保证了一次只能有一个线程在执行，其他线程进不来，这就是同步的锁机制。
 *
 * 好处：解决了多线程的安全问题。
 * 弊端：降低效率。
 *
 * 有可能出现的问题
 * 多线程安全问题出现后，加入了同步机制，但安全问题依旧。
 * 这时肯定是同步出了问题，只要遵守了同步的前提，就可以解决。
 *
 * 同步的前提：
 * 多个线程在同步中必须使用同一个锁，这才是对多个线程同步。
 *
 *
 */


class Tickets implements Runnable {
    private int tickets = 100;
    Object obj = new Object();
    public void run() {
        while(true) {
            //同步代码块
            synchronized(obj) {
                if(tickets > 0) {
                    //让线程停20ms，以演示，多线程的安全问题。
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e){
                    }
                    System.out.println(Thread.currentThread().getName() + "..." + tickets --);
                }
            }
        }
    }
}


public class TicketsDemo {
    public static void main (String[] args) {
        //线程任务对象
        Tickets t = new Tickets();
        //通过Thread类实例，创建四个线程。
        Thread td1 = new Thread(t);
        Thread td2 = new Thread(t);
        Thread td3 = new Thread(t);
        Thread td4 = new Thread(t);
        //开启线程
        td1.start();
        td2.start();
        td3.start();
        td4.start();    
    }
    
}
