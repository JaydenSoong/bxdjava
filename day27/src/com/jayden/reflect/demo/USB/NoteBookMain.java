package com.jayden.reflect.demo.USB;

/**
 * Created by DaiLiang on 2017/3/29.
 * 使用自定义笔记本
 */
public class NoteBookMain {
    public static void main(String[] args) {
        NoteBook nb = new NoteBook();
        nb.run();
        nb.useUsb(null);
        nb.useUsb(new USBMouse());
    }
}
