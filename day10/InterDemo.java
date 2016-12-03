//定义 Usb 接口
interface Usb {
    //Usb 打开的方法
    public void open();
    //Usb 关闭的方法
    public void close();
}


//定义笔记本类
class NoteBook {

    public void run() {
        System.out.println("The NoteBook run...");    
    }

    //使用鼠标接口
    public void useUsb(Usb u) {
        u.open();
        u.close();
    }
}


//定义鼠标类，实现了 Usb 接口
class MouseByUsb implements Usb {

    //覆盖接口方法
    public void open() {
        System.out.println("mouse is using...");
    }

    //覆盖接口方法
    public void close() {
        System.out.println("mouse was closed...");
    }
}


public class InterDemo {
    
    public static void main (String[] args) {
        NoteBook nb = new NoteBook();
        nb.run();

        nb.useUsb(new MouseByUsb());
    }
}
