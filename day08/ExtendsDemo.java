/**
 * 继承：
 *      1.提高了代码的复用性。
 *      2.让类与类之间产生了关系，为面对对象的第三个特征多态提供了前提。
 */

class Person {//将学生和工人的共性代码向上抽取到一个共性类中。
    
    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    
    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }
}


class Students extends Person {//学生类
    public void study() {
        System.out.println("好好学习!");
    }
}


class Worker extends Person {//工人类
    public void work() {
        System.out.println("努力工作!");
    }
}


public class ExtendsDemo {
    
    public static void main (String[] args) {
        Students s = new Students();
        s.setName("小明");
        s.setAge(15);
        System.out.print("我是一名学生，我的名字是：" + s.getName() + ",我今年" + s.getAge() + "了，我要");
        s.study();
        
        Worker w = new Worker();
        w.setName("刚子");
        w.setAge(30);
        System.out.print("我是一名工人，我的名字是：" + w.getName() + ",我今年" + w.getAge() + "了，我要");   
        w.work();
    }
}
