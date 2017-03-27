package com.jayden.net.demo;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * Created by SOONG on 2017/3/27.
 * TCP 连接的客户端演示
 */
public class TCPClient {
    public static void main(String[] args) throws IOException {
        /*
         * 1、建立 TCP 客户端服务
         *    1.1、因为是面向连接，必须有连接才可以通信
         *    1.2、在创建客户端时，就必须明确目的地址和端口。
         * 2、一旦连接建立，就有了传输数据的通道，就可以在通道中进行数据的传输。
         *    这个传输其实就是通过流实现的，这个流就是 socket io 流。
         * 3、只要获取 socket io 流中的输出流，就可以通过写方法将数据发送给服务端。
         * 4、关闭资源。
         */

        System.out.println("客户端启动......");
//        1、建立 TCP 客户端服务
        Socket s = new Socket(InetAddress.getByName("192.168.3.33"), 10002);
//        2、获取输出流
        OutputStream opt = s.getOutputStream();
//        3、通过写方法，传输数据
        opt.write("这是 TCP 传输方式".getBytes());
//        4、释放资源
        s.close();
    }
}
