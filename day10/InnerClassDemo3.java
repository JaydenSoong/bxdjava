/*
 
   将内部类定义在局部位置上

 */


class Outer {
    private int num = 4;
    
    public void method() {
        int x = 5; 
        class Inner {
            void show() {
                System.out.println("x=" + x);   //jdk1.8 以前，必须用 final 修饰，内部类才能访问，jdk1.8以后，内部类里效果等同于final。
                System.out.println("show..." + num);
            }
        }
        new Inner().show();
    }
}


public class InnerClassDemo3 {
    public static void main (String[] args) {
        new Outer().method();   
    }
}
