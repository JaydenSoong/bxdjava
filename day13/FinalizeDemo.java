/*
多线程的运行根据cpu的切换完成的，怎么切换cpu决定。
所以多线程运行有一个随机性（cpu的快速切换造成的）。

jvm中的多线程：
jvm中至少有两个线程：一个负责自定义代码运行的，这个从main方法开始执行的线程称为主线程；
一个是负责垃圾回收的。

通过实验，会发现每次结果不一定相同，这就是随机性造成的。

而且每一个线程都有运行的代码内容，这个就是线程的任务。之所以创建一个线程，就是为了去运行制定的任务代码。

而线程的任务都封装在特定的区域中。
比如：
主线程运行的任务都定义在main方法中。
垃圾回收线程在收垃圾都会运行finalize方法。

*/


class Demo {
    //定义垃圾回收方法
    protected void finalize() {
        System.out.println("Demo over!");
    }
}


public class FinalizeDemo {
    public static void main (String[] args) {
        new Demo();   
        new Demo();   
        new Demo();   
        new Demo();   
        new Demo();
        //启动垃圾回收方法
        System.gc();
        System.out.println("Hello, World!");
    }
}
