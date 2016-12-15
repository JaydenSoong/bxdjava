/*
 * 小节：
 * 异常：其实就是将问题封装成对象，并抛给调用者。
 *       如果声明了，就需要调用者处理（继续声明 or 捕获）。
 *       什么时候声明？什么时候捕获？
 *       功能内部可以解决，就捕获。不能解决，或者解决了还必须告诉调用者问题这时就应该声明。
 *
 */


/*
 *
 * 举例：毕老师用电脑上课
 *
 * 可能发生的问题：电脑蓝屏、电脑着火。
 * 要对问题进行描述。
 *
 */


/**
 * 
 * 蓝屏异常类
 *
 */
class LanpingException extends Exception {
    
    //无参数构造方法
    LanpingException(){
        super();
    }

    //带字符串构造方法
    LanpingException(String message){
        super(message);
    }
}


/**
 * 
 * 着火异常类
 *
 */
class ZhuohuoException extends Exception {
    
    //无参数构造方法
    ZhuohuoException(){
        super();
    }

    //带字符串构造方法
    ZhuohuoException(String message){
        super(message);
    }
}

/**
 * 
 * 课时进度停止 
 *
 */
class NoplanException extends Exception {
    
    //无参数构造方法
    NoplanException(){
        super();
    }

    //带字符串构造方法
    NoplanException(String message){
        super(message);
    }
}


/**
 *
 * 电脑类
 * 具备一个方法，运行 run()。
 *
 */
class Computer {
    
    //电脑状态
    int state = 2;
   
    //运行时有异常，应声明
    public void run() throws LanpingException, ZhuohuoException {
        
        //对不同异常分别进行抛出处理
        if (state == 1)
            throw new LanpingException("The Computer was died.");
        if (state == 2)
            throw new ZhuohuoException("The Computer was broked.");

        System.out.println("Computer running...");
    }

    public void reset() {
        
        System.out.println("Reset the Computer...");

        //状态重置
        state = 0;
    }
}


/**
 *
 * 教师类
 * 具有两个成员变量 name、comp。
 *
 * 一个构造方法
 *
 * 一个讲课的方法 prelect()
 *
 */
class Teacher {
    
    private String name;
    private Computer comp;

    //教师持有电脑
    Teacher(String name) {
        this.name = name;
        comp = new Computer();
    }

    //教师讲课，先开电脑，接着上课。
    public void prelect() throws NoplanException { //声明不能处理的异常
         
        try {
            comp.run();     
            System.out.println("Class beginning...");
        } catch(LanpingException e) { //解决电脑蓝屏问题
            System.out.println(e.toString());
            comp.reset();
            prelect();
        } catch(ZhuohuoException e) { //处理电脑着火问题
            System.out.println(e.toString());
            test();
            //异常转换,继续抛出异常
            throw new NoplanException("Can't prelect.");
        }
        
    }

    //让学生们做作业的方法
    public void test() {
        System.out.println("Do your homework...");
    }
}


public class ExceptionTest {
    
    public static void main (String[] args) {
        Teacher t = new Teacher("Mr. Bi");
        try {
            t.prelect();    
        } catch(NoplanException e) {
            System.out.println(e.toString());
            System.out.println("Call another teacher.");
        }
    }
}
