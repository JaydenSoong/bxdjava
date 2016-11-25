/**
 * 继承关系中构造方法的调用
 * 子类中，所有构造方法的第一行默认都有一个隐式的 super(); 语句。
 * 也可显示地用 super(实参列表) 调用父类的构造方法,当调用本类中的构造方法用 this(实参列表) 语句。
 * 子类初始化必须先调用父类构造方法，因为子类继承了父类中的内容，所以创建对象时必须要先看父类是如何对内容进行初始化的。
 * 注意：1.当父类中没有空参数构造方法时，子类需要通过显示定义 super 语句指定要访问的父类中的构造方法。
 * 2.用来调用父类构造方法的 super 语句在子类的构造方法中必须定义在第一行，因为父类的初始化要先完成。同样的 this() 语句也是在第一行，所以，有了 this(); 语句，就没有 super(); 语句，反之亦然。
 * 问题：1.this 和 super 用于用于调用构造方法，可能同时存在吗？
 * 不可以，因为它们只能定义在第一行。
 * 2.为什么需要定义在第一行？
 * 因为初始化要先执行。
 */


public class ConstructorExtends {
    
    public static void main (String[] args) {
        
        Student s = new Student("小明", 15);
        Worker w = new Worker("刚子", 35);    
    }
}

class Person {
    
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    } 

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age=age;
    }

    public int getAge(){
        return this.age;
    }
}


class Student extends Person {
    
    Student(String name, int age) {
        //显示地调用父类的构造方法
        super(name, age);
    }

    public void study() {
        System.out.print("好好学习！");
    }
}


class Worker extends Person {
    
    Worker(String name, int age) {
        //显示地调用父类的构造方法
        super(name, age);
    }

    public void work() {
        System.out.print("努力工作！");
    }
}
