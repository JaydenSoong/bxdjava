package com.jayden.net.demo;

import java.io.*;
import java.net.Socket;

/**
 * Created by DaiLiang on 2017/3/28.
 * 上传文本文件客户端。上传本地文本文件，上传成功之后，显示服务端返回的“上传成功”字样。
 */
public class UploadTextClient {
    public static void main(String[] args) throws IOException {
        System.out.println("TCP 上传文本文件客户端启动......");
//        1、建立上传客户端服务
        Socket s = new Socket("172.16.17.71", 10008);
//        2、明确要传输的文件（IO 源）
        BufferedReader bufr = new BufferedReader(new FileReader("uploadclient.html"));
//        3、获取网络输出流，使用 PrintWriter 对象要注意自动刷新。
        PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
//        4、频繁的读写
        String line;
        while ((line = bufr.readLine()) != null){
            pw.println(line);
        }
//        5、上传完成之后，需要有结束方法（结服务端一个结束标记）；
        s.shutdownOutput();
//        6、获取网络输入流，处理服务端反馈信息
        BufferedReader bfrIn = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String str = bfrIn.readLine();
        System.out.println(str);
//        7、释放资源
        bufr.close();
        s.close();
    }
}
