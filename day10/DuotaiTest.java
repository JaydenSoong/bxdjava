/** 
 * 要求：
 * 
 * 描述棠外教师
 * 具有讲课();、改作业();的功能。
 *
 * 描述棠外信息技术教师
 * 具有讲课();、写代码();的功能。
 * */


class TWTeacher {

    public void teach() {
        System.out.println("同学们，快要考试了，要努力学习！");
    }

    public void check() {
        System.out.println("对...错...");
    }
}


class TWTecTeacher extends TWTeacher{

    public void teach() {
        System.out.println("Java");
    }

    public void code() {
        System.out.println("Hello, world！");
    }
}


class DuotaiTest {

    public static void main (String[] args) {
        //多态：向上转型。
        TWTeacher soong = new TWTecTeacher();
        soong.teach();
        soong.check();
        //soong.code();

        //向下转型
        TWTecTeacher s = (TWTecTeacher) soong;
        s.code();
    }
} 
