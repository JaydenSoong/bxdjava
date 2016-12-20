/*
 *
 * 进程：应用程序在内存中分配的空间。(正在运行的程序)
 *
 * 线程：进程中负责执行的执行单元，也称为执行路径。
 *       一个进程中至少有一个线程在负责该进程的运行。
 *       如果一个进程出现了多个线程，就称该程序为多线程程序。
 *
 * 多线程技术：解决多部分代码同时执行的需求，合理的使用cpu资源。
 *
 * 多线程的运行是根据cpu的切换完成的。所以多线程的运行有一个随机性。
 *
 * jvm中的多线程：
 *      至少有两个线程：一个是负责自定义代码运行的。一个是负责垃圾回收的。
 *
 *
 * 如何建立一个执行路径呢？
 * 通过查阅API文档 java.lang.Thread类。该类的描述中有创建线程的两种方式。
 * 
 * Ⅰ继承Thread类
 *   1.继承Thread类
 *   2.覆盖run方法
 *   3.创建子类对象就是创建线程对象
 *   4.调用Thread类中的start方法就可以执行线程。并会调用run方法。
 *
 *   start开启线程后，都会执行run方法。说明run方法中存储的是线程要运行的代码。
 *   所以，自定义线程的任务代码都存储在run方法中。
 *
 *
 * 调用start方法和调用run方法的区别？
 * 调用start方法会开启线程，让开户的线程去执行run方法中的线程任务。
 * 直接调用run方法，线程并未开启，去执行run方法的只有主线程。
 *
 */


//继承 Thread 类，以实现多线程。
class Demo extends Thread {
    private String name;

    public Demo(String name) {
        this.name = name;
    }

    //打印数组元素的方法
    public void printArr() {

        int[] iArr = new int[40];

        for(int i=0; i<iArr.length; i++) {
            iArr[i] = i + 1;
            System.out.println(name + "." + iArr[i]);
        }
    }

    //重写Thread的run()方法。必须的。
    public void run() {
        printArr();
    }
}


public class ThreadDemo {
    public static void main (String[] args) {
        Demo d1 = new Demo("d1");
        Demo d2 = new Demo("d2");
        //start()方法，启动线程，调用run方法
        d1.start();
        //start()方法，启动线程，调用run方法
        d2.start();
        Demo d3 = new Demo("d3");
        //main()方法，默认启动的线程
        d3.printArr();
    }
}
