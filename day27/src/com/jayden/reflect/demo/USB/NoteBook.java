package com.jayden.reflect.demo.USB;

/**
 * Created by DaiLiang on 2017/3/29.
 * 自定义笔记本
 */
class NoteBook {
    void run() {
        System.out.println("The NoteBook is running......");
    }
    void useUsb(USB usb){
        if(usb == null){
            System.out.println("No USB devices.");
        } else {
            usb.open();
            usb.close();
        }
    }
}
