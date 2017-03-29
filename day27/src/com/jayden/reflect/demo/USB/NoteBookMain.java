package com.jayden.reflect.demo.USB;

import java.io.*;
import java.util.Properties;

/**
 * Created by DaiLiang on 2017/3/29.
 * 使用自定义笔记本
 */
public class NoteBookMain {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        NoteBook nb = new NoteBook();
        nb.run();
        nb.useUsb(null);
//        nb.useUsb(new USBMouse());
        /*
         * 因为有了鼠标，所以需要在源程序中，创建鼠标对象，并传给笔记本。
         * 希望后期出现新的 USB 设备后，可不可以不修改 NoteBookMain 源程序，还可以不断加入新设备
         *
         * 解决方式：反射
         */

//        对外提供配置文件
        File configFile = new File("config.properties");
        if (!configFile.exists())
            try {
                configFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
//        读取流和配置文件关联
        FileInputStream insr = new FileInputStream(configFile);
        Properties prop = new Properties();
//        将流中的数据加载到 prop
        prop.load(insr);
        for (int i = 1; i <= prop.size(); i++) {
            String className = prop.getProperty("usb" + i);
//            对指定类进行加载
            Class clax = Class.forName(className);
            USB usb = (USB)clax.newInstance();
            nb.useUsb(usb);
        }
    }
}
