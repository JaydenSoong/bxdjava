/*
 内部类：
     其实就是将类定义在了另一个类的内部
     A类要直接访问B类中和成员，可以将A类定义在B类中，作为B类的内部类存在

 访问规则：
     内部类可以直接访问外部类中的成员。
     外部类要想访问内部类，只能创建内部类的对象来访问

 编译时，内部类生成的类文件为：外部类$内部类.clas。如：Outer$Inner.class

*/


class Outer { //外部类
    private int num = 5; //外部类的私有成员

    class Inner { //内部类，定义在类里面的类，可以当成是外部类的一个成员
        public void show() {
            System.out.println(num); //内部类可以直接访问外部类的成员，私有的也可以
        }
    }

    public void method() {
        new Inner().show(); //外部类访问内部类，需先new对象
    }
}


public class InnerClassDemo {
    public static void main (String[] args) {
        new Outer().method();        
        //创建内部类对象
        Outer.Inner in = new Outer().new Inner();
        in.show();
    }
}
