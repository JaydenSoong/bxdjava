/*
 * 单线程演示
 */


class Demo {
    private String name;

    public Demo(String name) {
        this.name = name;
    }

    public void show() {
        for(int i=1; i<10; i++) {
            System.out.println(name + "..." +i);
        }
    }
}


public class SingleThread {
    public static void main (String[] args) {
        Demo d1 = new Demo("d1");
        Demo d2 = new Demo("d2");
        d1.show();
        d2.show();
    }
}
