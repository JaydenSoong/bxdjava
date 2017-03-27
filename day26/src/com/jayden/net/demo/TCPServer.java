package com.jayden.net.demo;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by SOONG on 2017/3/27.
 * TCP 连接的服务端演示
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        System.out.println("服务端启动......");
//        1、建立服务端
        ServerSocket ss = new ServerSocket(10002);
//        2、获取客户端
        Socket s = ss.accept();
        System.out.println(s.getInetAddress().getHostAddress() + "connected......");
//        3、获取输入流
        InputStream ins = s.getInputStream();
//        4、读取数据
        byte[] buf = new byte[1024];
        int len = ins.read(buf);
        String data = new String(buf, 0, len);
        System.out.println(data);
//        5、释放资源
        s.close();
        ss.close();
    }
}
