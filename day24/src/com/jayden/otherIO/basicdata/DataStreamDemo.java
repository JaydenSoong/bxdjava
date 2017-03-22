package com.jayden.otherIO.basicdata;

import java.io.*;

/**
 * Created by SOONG on 2017/3/22.
 * DataStream 演示
 */
public class DataStreamDemo {
    public static void main(String[] args) throws IOException {
        writeData();
        readData();
    }

    private static void readData() throws IOException {
        FileInputStream fis = new FileInputStream("mydata.data");
        DataInputStream dis = new DataInputStream(fis);
        System.out.println(dis.readBoolean());
        dis.close();
    }

    private static void writeData() throws IOException {
        FileOutputStream fis = new FileOutputStream("mydata.data");
        DataOutputStream dos = new DataOutputStream(fis);
        dos.writeBoolean(true);
        dos.close();
    }
}
