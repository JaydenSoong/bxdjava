/*
 *
 * 练习1:
 *     建立一个图形接口，声明一个求面积方法。圆形和矩形都实现这个接口。并得出两个图形的面积。
 *     要求：体现面向对象的特征，对数值进行判断。用异常处理，不合法的数值要出现“这个数值是非法的”
 *           提示，不再进行运算。
 */


//描述异常
class NoValueException extends RuntimeException {
    
    NoValueException() {
    
    }
    
    NoValueException(String msg) {
        super(msg);
    }
}


//建立图形接口
interface Areable {
    
    //计算面积的方法
    public double getArea();
}


//实现了图形接口的矩形类
class Rect implements Areable {
    
    //矩形的长、宽
    private double width, height;

    //矩形构造方法
    Rect(double width, double height) throws NoValueException{ //对方法内产生的运行时异常，方法上可以声明，也可以不声明。
        if(width <=0 || height <=0)
            throw new NoValueException("这个数值是非法的");
        this.width = width;
        this.height = height;
    }

    //重写接口方法，计算矩形面积
    public double getArea() {
        double rec_ar = width * height;
        return rec_ar;
    }
}


//实现了图形接口的圆类
class Circle implements Areable {
    
    //圆的半径
    private double radius;
    //圆周率
    public static final double PI = 3.14;

    //圆的构造方法
    Circle(double radius){
        if(radius <= 0)
            throw new NoValueException("这个数值是非法的");
        this.radius = radius;
    }

    //重写接口方法，计算圆的面积
    public double getArea() {
        double cir_ar = PI * radius * radius;
        return cir_ar;
    }
}


public class AreaTest {
   
    public static void main (String[] args) {

        Rect re = new Rect(3.4, 4.3);
        System.out.println(re.getArea());    

        Circle ci = new Circle(-3.4);
        System.out.println(ci.getArea());    
    }
}
