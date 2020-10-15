package practice.clay.day02.p2;

import java.util.Scanner;

public class Demo01Anonymous {
    public static void main(String[] args) {
       // new Person().setAge(23);//对象1的age是23
        //int realAge = new Person().getAge();//对象2的age是默认0
        //System.out.println(realAge);//打印对象2的age

        int a= new Scanner(System.in).nextInt();
        System.out.println(new Person());
        System.out.println(new Person());

    }
    //new 类名称();
    //发现匿名对象只能使用一次，再用一次就是创建了一个新的对象
    //其实匿名对象就是一个新建的不知道地址的heap内存地址值
}
