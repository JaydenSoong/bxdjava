/*
 * 创建线程的第二种方式----实现Runnable接口
 *
 * 1.定义一个类实现Runnable接口
 * 2.覆盖Runnable接口中的run方法，将线程要运行的任务代码存储到该方法中
 * 3.通过Thread类创建线程对象，并将实现了Runnable接口的对象作为Thread类的构造方法的参数进行传递。
 * 4.调用Thread类的start方法，开启线程。
 *
 * 实现Runnable接口的好处
 * 1.避免了继承Thread类的单继承的局限性。
 * 2.Runnable接口出现更符合面向对象，将线程单独进行线程的封装。
 * 3.Runnable接口降低了线程对象和线程任务的耦合性。
 * 所以，创建线程对象，都应采用第二种方式
 *
 */


class Tickets implements Runnable {
    private int tickets = 100;

    public void run() {
        while(true) {
            if(tickets > 0) {
                System.out.println(Thread.currentThread().getName() + "..." + tickets --);
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
