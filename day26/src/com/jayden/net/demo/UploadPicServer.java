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
        while (true){
//        2、获取客户端
            Socket s = ss.accept();
//        3、多线程技术，使不同的客户端可以同时上传
            new Thread(new PicUpload(s)).start();
        }
    }
}
