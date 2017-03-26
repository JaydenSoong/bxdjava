package com.jayden.net.demo;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by SOONG on 2017/3/26.
 * InetAdress 演示
 */
public class InetAdressDemo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress ia = InetAddress.getLocalHost();
        System.out.println(ia);
    }
}
