package com.jayden.net.demo;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by SOONG on 2017/3/26.
 * InetAdress 演示
 */
public class InetAdressDemo {
    public static void main(String[] args) throws UnknownHostException {
//        获取本机 IP 信息
        InetAddress ia = InetAddress.getLocalHost();
        System.out.println(ia);

//        获取网络主机信息
        InetAddress ip = InetAddress.getByName("www.tangwai.com");
        System.out.println(ip.getHostAddress());
        System.out.println(ip.getHostName());
    }
}
