/**
 * 抽象类应用
 *
 * 需求：
 * 公司中程序员有姓名、工号、薪水、工作内容。项目经理除了有姓名、工号、薪水、工作内容，还有奖金。
 * 对给出的需求进行数据建模
 */


//描述雇员的雇员类
abstract class Employee {
    
    private String name;
    private String id;
    private double pay;

    Employee(String name, String id, double pay) {
        this.name = name;
        this.id = id;
        this.pay = pay;
    }

    public abstract void work();
}


//描述程序员的程序员类
class Programmer extends Employee {

    Programmer(String name, String id, double pay) {
        super(name, id, pay);
    }

    public void work() {
        System.out.println("code...");
    }
}


//描述经理的经理类
class Manager extends Employee {

    private double bonus;

    Manager(String name, String id, double pay, double bonus) {
        super(name, id, pay);
        this.bonus = bonus;
    }

    public void work() {
        System.out.println("manage...");
    }
}
