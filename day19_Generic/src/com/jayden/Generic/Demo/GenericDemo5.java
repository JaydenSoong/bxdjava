package com.jayden.Generic.Demo;

/**
 * Created by DaiLiang on 2017/3/7.
 * 泛型方法演示
 */
public class GenericDemo5 {
    public static void main(String[] args) {
        Print<String> p = new Print<>();
        p.show("abc");
        p.print(3);
//        show()方法只能接受类规定的参数，所以下面的语句编译不能通过
//        p.show(4);
        Print.staticShow('c');
    }
}

class Print<E> {

    void show(E o){
        System.out.println(o);
    }

//    静态方法，若要规定参数，需定义为泛型方法。
    static<S> void staticShow(S o){
        System.out.println(o);
    }

//    泛型方法，定义可以接受的参数，可与类的参数不一致
    <O> void print(O o) {
        System.out.println(o);
    }
}
