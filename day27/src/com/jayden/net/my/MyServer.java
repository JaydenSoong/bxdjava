package com.jayden.net.my;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by SOONG on 2017/3/28.
 * 模拟服务器
 */
public class MyServer {
    public static void main(String[] args) throws IOException {
//        1、建立服务
        ServerSocket ss = new ServerSocket(9090);
        Socket s = ss.accept();
        String ip = s.getInetAddress().getHostAddress();
        System.out.println(ip + "......connected.");

        //获取浏览器请求信息
        InputStream is = s.getInputStream();
        byte[] buf = new byte[1024];
        int len = is.read(buf);
        String str = new String(buf, 0,len);
        System.out.println(str);

        //给浏览器一个反馈
        PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
        pw.println("<h1 style='color:red; font-size:16px;'>你访问的是自定义服务器！</h1>");

        s.close();
        ss.close();
    }
}
