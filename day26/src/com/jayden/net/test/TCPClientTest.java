package com.jayden.net.test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by SOONG on 2017/3/27.
 * 建立 TCP 客户端，向服务端发送数据，并显示服务端应答
 */
public class TCPClientTest {
    public static void main(String[] args) throws IOException {
        System.out.println("客户端启动......");
//        1、建立客户端
        Socket s = new Socket("192.168.3.33", 10004);
//        2、获取输出流，发送数据
        OutputStream os = s.getOutputStream();
        os.write("我是客户端一，请回答，请回答".getBytes());
//        3、处理服务端应答
        InputStream is = s.getInputStream();
        byte[] buf = new byte[1024];
        int len = is.read(buf);
        String data = new String(buf, 0, len);
        System.out.println(data);
    }
}
