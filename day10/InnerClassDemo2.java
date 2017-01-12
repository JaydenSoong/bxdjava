/*

 为什么内部类可以直接访问外部类中的成员？
 那是因为内部类持有了外部的引用——外部类名.this

*/


class Outer {
    int num = 2;
    
    class Inner {
        int num = 3;

        void show() {
            int num = 4;
            System.out.println("show..." + num);    //输出4，局部变量
            System.out.println("show..." + Inner.this.num);    //输出3，持有内部类this引用
            System.out.println("show..." + Outer.this.num);    //输出2，持有外部类this引用 
        }
    }

    public void method() {
        new Inner().show();
    }
}


public class InnerClassDemo2 {
    public static void main (String[] args) {
        new Outer().method();   
    }
}
