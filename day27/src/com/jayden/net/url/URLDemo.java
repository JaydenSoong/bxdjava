package com.jayden.net.url;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by DaiLiang on 2017/3/29.
 * 解析 URL 演示
 */
public class URLDemo {
    public static void main(String[] args) throws IOException {
        String str_url = "http://blog.csdn.net/wanghuan203/article/details/7028754";
        URL url = new URL(str_url);
        System.out.println("getProtocol:" + url.getProtocol());
        System.out.println("getHost:" + url.getHost());
        System.out.println("getPath:" + url.getPath());
        System.out.println("getFile:" + url.getFile());
        System.out.println("----------------------------------");


        String str_urls = "http://172.16.16.1";
        URL url1 = new URL(str_urls);
//        通过 openConnection() 获取到远程资源的连接对象
        URLConnection uc = url1.openConnection();
//        调用连接对象的读取方法，读取资源
        BufferedReader bufr = new BufferedReader(new InputStreamReader(uc.getInputStream()));
        String line;
        while ((line = bufr.readLine()) != null){
            System.out.println(line);
        }
    }
}
