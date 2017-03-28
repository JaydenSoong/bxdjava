package com.jayden.net.demo;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by DaiLiang on 2017/3/28.
 * 图片上传服务端，接收图片，存入本地，返回“图片上传成功”字样
 */
public class UploadPicServer {
    public static void main(String[] args) throws IOException {
        System.out.println("图片上传服务端启动......");
//        1、建立图片上传服务端
        ServerSocket ss = new ServerSocket(10010);
//        2、获取客户端
        Socket s = ss.accept();
        String ip = s.getInetAddress().getHostAddress();
        System.out.println(ip + "connected......");
//        3、读取文件，并写入
//        3.1、明确本地文件
        File dir = new File("e:\\server_pic");
        if (!dir.exists())
            dir.mkdir();
//        3.2、解决重名问题
        int count = 1;
        File destFile = new File(dir, ip + "(" + count + ")" + ".jpg");
        if (destFile.exists()){
            count ++;
            destFile = new File(dir, ip + "(" + count + ")" + ".jpg");
        }
//        3.2、明确输出流
        FileOutputStream fos = new FileOutputStream(destFile);
//        3.2、获取输入流
        InputStream ins = s.getInputStream();
//        3.4、频繁读写
        byte[] buf = new byte[1024];
        int len;
        while ((len = ins.read(buf)) != -1){
            fos.write(buf, 0, len);
        }
//        4、反馈信息
        OutputStream out = s.getOutputStream();
        out.write("图片上传成功".getBytes());
//        5、释放资源
        fos.close();
        s.close();
        ss.close();
    }
}
