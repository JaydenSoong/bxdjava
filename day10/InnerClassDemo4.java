/*
 匿名内部类：简化书写的内部类

 前提：
      内部类需要继承或者实现外部类或者接口。

 格式：
      new 父类or接口名(){子类内容}

 匿名内部内其实就是一个子类对象

*/


//抽象类
abstract class Demo {
    //抽象方法，须被重写
    abstract void show();
}


class Outer {
    private int num = 8;

    //继承抽象类的内部类。
    class Inner extends Demo {
        //重写抽象方法
        public void show() {
            System.out.println("num..." + num);
        }
    }

    public void method() {
        //使用普通内部类
        new Inner().show();
        //匿名内部类
        new Demo() {
            //重写抽象方法
            public void show() {
                System.out.println("num---" + num);
            }
        }.show();
    }
}


public class InnerClassDemo4 {
    public static void main (String[] args) {
        new Outer().method();  
    }
}
