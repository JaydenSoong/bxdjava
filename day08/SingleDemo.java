/**
 * 设计模式：解决某一种问题的一种思想，是一种行之有效的解决方式。
 *           面向对象的语言共有 23 种设计模式。
 *
 * 单例设计模式
 * 解决的问题：保证一个类的对象在内存中的唯一性。
 * 应用场景：多个程序都在操作同一个配置文件时，需要程序 A 操作后的结果，程序 B 要知道并继续基于 A 操作后的结果进行操作。前提，数据都存储在配置文件对象中，要求程序 A 和程序 B 操作的配置文件对象是同一个。
 *
 * 思路：1.不让其他程序通过 new 关键字创建对象。
 *       2.在本类中自己通过 new 创建对象，以实现数量控制。
 *       3.对外提供让其他程序获取该对象的方式。
 *
 * 步骤：1.将类中的构造方法私有化。
 *       2.在本类中 new 一个对象。
 *       3.定义一个方法返回该对象。
 *
 */

class Single {//单例设计模式

    //创建一个本类对象
    private static Single s = new Single();
    
    //构造方法私有化
    private Single() {
    }

    //定义一个方法返回该对象，让其他程序可以获取到。之所以定义访问方法，是为了可控
    public static Single getInstance() {
        return s;
    }
}

class Single2 {//单例设计模式的另外一种形式（延迟加载方式）
    private static Single2 s = null;
    private Single2 () {
    }
    public static Single2 getInstance() {
        if (s == null) {
            s = new Single2();
        }
        return s;
    }

}


public class SingleDemo {
    
    public static void main(String[] args) {
        Single s1 = Single.getInstance();
        Single s2 = Single.getInstance();
        System.out.println(s1 == s2);
        Single2 s3 = Single2.getInstance();
        Single2 s4 = Single2.getInstance();
        System.out.println(s3 == s4);
    }
}
