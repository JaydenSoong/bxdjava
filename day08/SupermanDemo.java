/**
 *  单例设计模式应用举例
 */

class Superman {
    
    private String name;
    private static Superman s = new Superman("Clark");

    private Superman(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public static Superman getInstance() {
        return s;
    }
}

class SupermanDemo {

    public static void main (String[] args) {
        Superman s1 = Superman.getInstance();
        System.out.println(s1.getName());
        Superman s2 = Superman.getInstance();
        s2.setName("克拉克");
        System.out.println(s2.getName());
        System.out.println(s1 == s2);
    }
}
