package com.jayden.otherIO.piped;

import java.io.*;

/**
 * Created by SOONG on 2017/3/22.
 * 管道流 演示
 */
public class PipedStreamDemo {
    public static void main(String[] args) throws IOException {
//        创建管道对象
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();

//        连接两个流
        pis.connect(pos);

//        启动线程
        new Thread(new Input(pis)).start();
        new Thread(new Output(pos)).start();
    }
}


//定义输入任务
class Input implements Runnable{
    private PipedInputStream pis;

    public Input(PipedInputStream pis) {
        this.pis = pis;
    }

    @Override
    public void run() {
        byte[] bytes = new byte[1024];
        int len = 0;
        try {
            len = pis.read(bytes);
            String str = new String(bytes, 0 ,len);
            System.out.println(str);
            pis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}


//定义输出任务
class Output implements Runnable{
    private PipedOutputStream pos;

    public Output(PipedOutputStream pos) {
        this.pos = pos;
    }

    @Override
    public void run() {
        try {
            pos.write("Hi, it's Piped.".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            pos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
