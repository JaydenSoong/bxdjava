/**
 * 抽象类
 *
 * 分析问题：
 * 描述狗，具备吼叫功能。
 * 描述狼，具备吼叫功能。
 * 两个事物具备共性，向上抽取。犬科，具备吼叫功能。
 *
 * 描述一个事物，却没有足够信息，这时就将这个事物称为抽象事物。
 *
 * 作用：面对抽象的事物，虽然不具体，但是可怪简单化，不用面对具体的事物。
 *
 * 特点：
 * 1.抽象方法一定在抽象类中，都需要用 abstract 来修饰。
 * 2.抽象类不能实例化。
 * 3.只有子类覆盖了所有的抽象方法后，子类具体化，子类才能创建对象。如果没有覆盖所有抽象方法，那么子类还是一个抽象类。
 *
 * 抽象类也是不断的向上抽取而来的。抽取了方法的声明而不确定具体的方法内容，由不同的子类来完成具体的方法内容。
 *
 * 问题：
 * 1.抽象类中有构造方法吗？
 *   有，抽象类的构造方法虽然不能给抽象类对象实例化，因为抽象类不能创建对象。但是抽象类有子类，它的的构造方法可以子类对象实例化。
 *   
 *   抽象类和一般类的异同点？
 *   相同：都是用来描述事物，都可以进行属性和行为的描述。
 *   不同：抽象类描述事物的信息不具体，一般类描述事物的信息具体。
 *   代码不不同：
 *      抽象类中可以定义抽象方法，一般类不行。
 *      抽象类不可以实例化，一般类可以。
 * 2.抽象类一定是一个父类吗？
 *   是。
 * 3.抽象类中可以不定义抽象方法吗？
 *   可以，此时抽象类的作用仅是用来禁止创建对象。
 * 4.抽象关键字 abstract 和哪些关键字不能共存？
 *   final: final 修饰的方法不能被覆盖，abstract 修饰的方法必须被覆盖。
 *          final 修饰的类不能被继承，abstract 修饰的类必须被继承。
 *   private: private 修饰的成员是私有的，不能被继承。
 *   static: static 修饰的成员是类变量，类方法。可用类名调用，而抽象类调用它的抽象方法是没有意义的。
 */

//抽象类
abstract class 犬科 {
    //抽象方法
    abstract void 吼叫();
}


class 狗 extends 犬科 {
    void 吼叫() {
        System.out.println("汪汪...");
    }
}


class 狼 extends 犬科 {
    void 吼叫() {
        System.out.println("嗷嗷...");
    }
}