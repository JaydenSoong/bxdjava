package com.jayden.net.demo;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by DaiLiang on 2017/3/28.
 * 上传文本文件，服务端。接收客户端上传的文件，写入本地。并返回“上传成功”字样。
 */
public class UploadTextServer {
    public static void main(String[] args) throws IOException {
        System.out.println("上传文本服务端启动......");
//        1、建立上传文本文件服务端
        ServerSocket ss = new ServerSocket(10008);
//        2、获取客户端
        Socket s = ss.accept();
        System.out.println(s.getInetAddress().getHostAddress() + "connected......");
//        3、获取网络输入流
        BufferedReader bufrIn = new BufferedReader(new InputStreamReader(s.getInputStream()));
//        4、明确本地文件
        BufferedWriter bufw = new BufferedWriter(new FileWriter(new File("uploadServer.html")));
//        5、频繁读写
        String line;
        while ((line = bufrIn.readLine()) != null) {
            bufw.write(line);
            bufw.flush();
        }
//        6、返回信息
        BufferedWriter bufwO = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        bufwO.write("上传成功");
        bufwO.flush();
//        7、释放资源
        bufw.close();
        s.close();
        ss.close();
    }
}
