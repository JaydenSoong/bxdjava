package com.jayden.net.demo;

import java.io.*;
import java.net.Socket;

/**
 * Created by SOONG on 2017/3/28.
 * 图片上传任务类
 */
public class PicUpload implements Runnable {
    private Socket s;

    public PicUpload(Socket s) {
        this.s = s;
    }

    @Override
    public void run() {
        String ip = s.getInetAddress().getHostAddress();
        System.out.println(ip + "connected......");
//        1、读取文件，并写入
//           1.1、明确本地文件
        File dir = new File("d:\\server_pic");
        if (!dir.exists())
            dir.mkdir();
//           1.2、解决重名问题
        int count = 1;
        File destFile = new File(dir, ip + "(" + count + ")" + ".jpg");
        while (destFile.exists()){
            count ++;
            destFile = new File(dir, ip + "(" + count + ")" + ".jpg");
        }
//          1.3、明确输出流
        FileOutputStream fos;
        try {
            fos = new FileOutputStream(destFile);
//          1.4、获取输入流
            InputStream ins = s.getInputStream();
//          1.5、频繁读写
            byte[] buf = new byte[1024];
            int len;
            while ((len = ins.read(buf)) != -1){
                fos.write(buf, 0, len);
            }
//        2、反馈信息
            OutputStream out = s.getOutputStream();
            out.write("图片上传成功".getBytes());
//        3、释放资源
            fos.close();
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
