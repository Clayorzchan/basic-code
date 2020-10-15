package practice.clay.day01.p6;


/*
构造方法：
专门用来创建对象的方法
用关键字new创建对象时，其实就是调用构造方法
public 类名称(参数类型 参数名称){
    方法体；
}
 */

public class Student {
    //成员变量
    private int age;
    private String name;

    //无参构造方法
    public Student() {//无参数构造方法
        System.out.println("无参");
    }

    //有参构造方法
    public Student(String name, int age) { //有参构造方法
        this.age = age;
        this.name = name;
        System.out.println("全参");
    }

    //getter setter方法
    public void setAge(int age) {
        if (age < 0 || age >= 150) {
            System.out.println("error age range.");
        } else {
            this.age = age;
        }
    }
    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        if (name.length() >= 25) {
            System.out.println("error name length.");
        } else {
            this.name = name;
        }
    }
    public String getName() {
        return name;
    }
}
