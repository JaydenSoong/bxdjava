/*
 *
 * 描述 Persong
 * 属性：姓名和年龄
 * 行为：1.说出姓名和年龄
 *       2.判断是否是同一个人（同姓名，同年龄视为同一个人）。
 * 提示：判断姓名相同的方法到 API 文档 String 类中查找。
 *
 */


class Person {
    
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void introduce () {
        System.out.println("我的名字是：" + getName() + ", 我的年龄是：" + getAge());
    }

    public void sameOne(Person p) {
        if (this.getAge() == p.getAge() || this.getName().equals(p.getName())) {
            System.out.println("是同一个人");
        } else {
            System.out.println("不是同一个人");
        }
    }
}


public class PersonTest {
    public static void main (String[] args) {
        Person p1 = new Person("张三", 21);
        Person p2 = new Person("李四", 22);
        Person p3 = new Person("张三", 21);

        p1.introduce();
        p2.introduce();
        p1.sameOne(p3);
        p1.sameOne(p2);
    }
}
