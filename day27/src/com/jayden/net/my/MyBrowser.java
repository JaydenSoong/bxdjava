package com.jayden.net.my;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by SOONG on 2017/3/28.
 * 模拟浏览器
 */
public class MyBrowser {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.3.33", 9090);
//        请求头信息
        PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
        pw.println("GET /index.html HTTP/1.1");
        pw.println("Accept: text/html, application/xhtml+xml, image/jxr, */*");
        pw.println("Accept-Language: zh-CN");
        pw.println("User-Agent: Mozilla/5.0 (Windows NT 10.0; WOW64; Trident/7.0; rv:11.0) like Gecko");
        pw.println("Accept-Encoding: gzip, deflate");
        pw.println("Host: 192.168.3.33:9090");
        pw.println("Connection: Keep-Alive");

//        读取反馈信息
        InputStream is = s.getInputStream();
        byte[] buf = new byte[1024];
        int len = is.read(buf);
        String str = new String(buf, 0, len);
        System.out.println(str);
        s.close();
    }
}
