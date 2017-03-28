package com.jayden.net.demo;

import java.io.*;
import java.net.Socket;

/**
 * Created by DaiLiang on 2017/3/28.
 * 图片上传客户端，上传本地图片，显示服务端反馈信息“图片上传成功”。
 */
public class UploadPicClient {
    public static void main(String[] args) throws IOException {
        System.out.println("图片上传客户端启动......");
//        1、建立图片上传客户端
        Socket s = new Socket("192.168.80.104", 10010);
//        2、明确上传文件（流的源文件）
        FileInputStream fis = new FileInputStream(new File("3.jpg"));
//        3、明确网络输出流
        OutputStream ops = s.getOutputStream();
//        4、频繁读写
        byte[] buf = new byte[1024];
        int len;
        while ((len = fis.read(buf)) != -1){
            ops.write(buf, 0, len);
        }
//        5、读写完成后，发送结束标记
        s.shutdownOutput();
//        6、处理服务端反馈信息
        InputStream ins = s.getInputStream();
        byte[] bufIn = new byte[1024];
        int lenIn = ins.read(bufIn);
        System.out.println(new String(bufIn, 0, lenIn));
//        7、释放资源
        fis.close();
        s.close();
    }
}
