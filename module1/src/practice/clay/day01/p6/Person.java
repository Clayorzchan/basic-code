package practice.clay.day01.p6;

public class Person {
    String name;

    public void sayHello(String name) {
        System.out.println(name + " Hello , I am " + this.name + ".");
        System.out.println(this);
        //this.name是成员变量name
        //不加this，就是局部变量
    }
}
