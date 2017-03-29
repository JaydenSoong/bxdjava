package com.jayden.reflect.demo.USB;

/**
 * Created by DaiLiang on 2017/3/29.
 */
public class USBKey implements USB{
    @Override
    public void open() {
        System.out.println("USBKey was opened.");
    }

    @Override
    public void close() {
        System.out.println("USBKey was closed.");
    }
}
