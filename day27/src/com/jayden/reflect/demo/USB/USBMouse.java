package com.jayden.reflect.demo.USB;

/**
 * Created by DaiLiang on 2017/3/29.
 * 实现 USB 接口的鼠标
 */
public class USBMouse implements USB{
    @Override
    public void open() {
        System.out.println("USB Mouse was opened.");
    }

    @Override
    public void close() {
        System.out.println("USB Mouse was closed.");
    }
}
