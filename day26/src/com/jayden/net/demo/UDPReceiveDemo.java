package com.jayden.net.demo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * Created by DaiLiang on 2017/3/27.
 * UDP 协议接收演示
 */
public class UDPReceiveDemo {
    /*
     * 需求：建立 UDP 接收端，接收数据。
     * 1、建立接收端
     * 2、接收数据
     * 3、解析数据
     * 4、释放资源
     */
    public static void main(String[] args) throws IOException {
//        1、建立接收端，要明确端口
        DatagramSocket ds = new DatagramSocket(10000);
//        2、接收数据  void receive(DatagramPacket p)
        byte[] buf = new byte[1024];
        DatagramPacket dp = new DatagramPacket(buf, buf.length);
        ds.receive(dp);
//        3、解析数据
        String ip = dp.getAddress().getHostAddress();
        int port = dp.getPort();
        String str = new String(dp.getData(), 0, dp.getLength());
        System.out.println(ip + " : " + port + " ------ "+ str);
//        4、释放资源
        ds.close();
    }
}
