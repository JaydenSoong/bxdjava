/**
 * final 关键字
 * final 关键字可以修饰类、方法、变量。
 * 1.被 final 修饰的类为最终类，不可以被继承。
 * 2.被 final 修饰的方法为最终方法，不可以被覆盖。
 * 3.被 final 修饰的变量叫常量，其值不可以被更改,书写规则为全部字母大写，多个单词间以 _ 分开。
 * 4.用 final 修饰成员变量时，若再加上 public 修饰，则被称为全局常量。
 * 
 */

//应用举例：单例设计模式
class Single {
    
    private static final SINGLE_INSTANCE = new Single();
    
    private Single(){
    }

    public static Single getInstance(){
        return SINGLE_INSTANCE;
    }
}
