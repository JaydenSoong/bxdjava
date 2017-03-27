package com.jayden.net.demo;

import java.io.IOException;
import java.net.*;

/**
 * Created by DaiLiang on 2017/3/27.
 * UDP 协议发送演示
 */
public class UDPSendDemo {
    /*
     * 需求：建立 UDP 发送端，发送数据。
     * 1、建立发送端
     * 2、明确发送数据
     * 3、发送数据
     * 4、释放资源
     */
    public static void main(String[] args) throws IOException {
        System.out.println("UDP 发送端启动......");
//        1、建立发送端
        DatagramSocket ds = new DatagramSocket();
//        2、明确发送数据
        String str = "这是 UDP 发送过来的数据";
//        3、发送数据  void send(DatagramPacket p)
        byte[] buf = str.getBytes();
        DatagramPacket dp = new DatagramPacket(buf, buf.length, InetAddress.getByName("172.16.17.71"), 10000);
        ds.send(dp);
//        4、释放资源
        ds.close();
    }
}
