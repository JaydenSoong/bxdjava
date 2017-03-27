package com.jayden.net.test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by SOONG on 2017/3/27.
 * 建立服务端，处理请求，并应答
 */
public class TCPServerTest {
    public static void main(String[] args) throws IOException {
        System.out.println("服务端启动......");
//        1、建立服务端
        ServerSocket ss = new ServerSocket(10004);
//        2、获取客户端
        Socket s = ss.accept();
        System.out.println(s.getInetAddress().getHostAddress());
//        3、处理请求
        InputStream is = s.getInputStream();
        byte[] buf = new byte[1024];
        int len = is.read(buf);
        String data = new String(buf, 0, len);
        System.out.println(data);
//        4、返回应答
        OutputStream os = s.getOutputStream();
        os.write("收到，收到。".getBytes());
//        5、释放资源
        s.close();
        ss.close(); //真正开发的时候，服务端资源一般不用释放
    }
}
