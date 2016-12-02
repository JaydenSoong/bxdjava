//定义 Usb 接口
interface Usb {
    //Usb 打开的方法
    public void open();
    //Usb 关闭的方法
    public void close();
}


class NoteBook {

    public void run() {
        System.out.println("The NoteBook run...");    
    }

    public void useUsb(Usb u) {
        u.open();
        u.close();
    }
}


class MouseByUsb implements Usb {

    public void open() {
        System.out.println("mouse is using...");
    }

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
