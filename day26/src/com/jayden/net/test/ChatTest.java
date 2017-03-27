package com.jayden.net.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * Created by DaiLiang on 2017/3/27.
 * UDP 聊天
 */
public class ChatTest {
    public static void main(String[] args) throws SocketException {
        DatagramSocket ds_s = new DatagramSocket(20000);
        DatagramSocket ds_r = new DatagramSocket(10003);

        new Thread(new Send(ds_s)).start();
        new Thread(new Receive(ds_r)).start();
    }
}


/**
 * 执行发送的类
 */
class Send implements Runnable{
//    发送功能的对象，在初始化时就应该有一个执行发送任务的Socket
    private DatagramSocket ds;

    Send(DatagramSocket ds) {
        this.ds = ds;
    }

    /**
     * 完成发送功能
     */
    @Override
    public void run() {
//        1、需要有发送的数据——要发送什么？
        BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
//        2、发送数据
        String line;
        try {
            while ((line = bufr.readLine()) != null) {
//                2.1、数据是以数据包的方式发送的，封装数据包必须要有数组
                byte[] buf = line.getBytes();
                DatagramPacket dp = new DatagramPacket(buf, buf.length,
//                        若 ip 最后一位为 255，则可以实现群聊（广播）
                        InetAddress.getByName("172.16.17.71"),10003);
//                2.2、发送数据
                ds.send(dp);
//                2.3、录入 over 结束聊天
                if ("over".equals(line)){
                    break;
                }
            }
//            3、发送完成后，释放资源
            ds.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


/**
 * 执行接收任务的类
 */
class Receive implements Runnable{
//    接收功能的对象，在初始化时就应该有一个执行接收任务的Socket
    private DatagramSocket ds;

    Receive(DatagramSocket ds) {
        this.ds = ds;
    }

    /**
     * 完成接收功能
     */
    @Override
    public void run() {
        while (true){
//            1、接收的数据是以数据包的形式完成的，创建数据包要有数组
            byte[] buf = new byte[1024];
            DatagramPacket dp = new DatagramPacket(buf, buf.length);
//            2、接收数据
            try {
                ds.receive(dp);
            } catch (IOException e) {
                e.printStackTrace();
            }
    //        3、获取数据
            String ip = dp.getAddress().getHostAddress();
            int port = dp.getPort();
            String data = new String(dp.getData(),0,dp.getLength());
            System.out.println(ip + " : " + port + " ---- " + data);
            if ("over".equals(data)){
                System.out.println(ip + "......离开了");
            }
        }
    }
}
