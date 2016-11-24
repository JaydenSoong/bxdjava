/**
 * 覆盖
 * 定义：当子父类中出现一模一样的方法时（private 修饰的除外，因为私有方法不能被继承），子类对象运行的是子类方法。这种特殊情况，称之为覆盖（Override）。
 * 特点：返回值类型，方法名，参数列表都一致。
 * 注意事项：
 * 1.子类方法覆盖父类方法，必须要保证权限大于或等于父类权限。
 * 2.静态只能覆盖静态，或者被静态覆盖。
 * 
 * 应用举例：
 */

//定义电话类
class Phone {
    
    void call() {
    }

    void sendMsg() {
    }

    //来电显示功能
    void show() {
        //只能显示来电号码
        System.out.println("number");
    }
}


//定义手机类，继承电话
class CellPhone extends Phone {
    //手机的来电显示功能
    void show() {
        System.out.println("number");
        System.out.println("name");
        System.out.println("picture");
    }
}


public class OverrideDemo {
    
    public static void main (String[] args) {
        CellPhone c = new CellPhone();
        c.show();
    }
}
