/*
 * 自定义异常结构
 *
 * Exception
 *    |--AException
 *    |      |--AAException
 *    |--BException
 * 
 * 覆盖时：
 * 子类方法覆盖父类方法只能抛出父类方法异常或者该异常的子类 。
 * 如果父类方法抛出多个异常，子类只能抛出父类异常的子集。
 * 
 * 原则：子类的异常必须要在父类的异常处理控制之中。
 *
 * 注意：有一种情况，只能 try 不能 throws。
 *       被覆盖的方法没有抛出异常。
 *       那么子类在覆盖时，子类方法中发生了异常，就只能 try 不能 throws 声明。
 * 如：
 *
 * interface Inter {
 *  
 *  void show();
 * }
 *
 * class Demo implements Inter {
 *  
 *  public void show() {
 *      try {
            throw new Exception();
        } catch(Exception e) {
            //不能再往外抛，必须处理。但可以将其转换为运行时异常。这样就不用声明
            throw new RuntimeException("");
        }
 *  }
 * }
 *
 */

//异常声明
class AException extends Exception {

}


//异常声明
class BException extends Exception {

}


//异常声明
class AAException extends AException {

}

//父类
class Fu {

    public void show() throws AException {
        System.out.println("Fu show");
    }
}


//子类
class Zi extends Fu {
    
    //覆盖父类方法
    public void show() throws AException {
        System.out.println("Zi show");
    }
}


//测试工具类
class Tool {
   
    //method 方法，需要一个对象作参数
    public void method(Fu f) {
        try {
            f.show();
        } catch(AException e) {
        }
    }
}


public class ExceptionDemo7 {

    public static void main (String[] args) {
        Tool t = new Tool();
        t.method(new Zi());
    }
}
