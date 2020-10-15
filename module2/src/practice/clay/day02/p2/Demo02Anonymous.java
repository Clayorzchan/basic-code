package practice.clay.day02.p2;

import java.util.Scanner;

public class Demo02Anonymous {

    public static void main(String[] args) {
        //普通使用
        //Scanner sc = new Scanner(System.in)；
        //int num = sc.nextInt();

        //匿名对象的方式
//    int num = new Scanner(System.in).nextInt();

        //一般写法传入参数给方法
//        Scanner sc = new Scanner(System.in);
//        methodParam(sc);

        //使用匿名对象来进行传参
//            methodParam(new Scanner(System.in));

        //
        Scanner sc = methodReturn();//返回值交给sc
        int num = sc.nextInt();
        System.out.println("number = " + num);
        methodParam(sc);


    }

    public static void methodParam(Scanner sc){
        System.out.println("output = " + sc.nextInt());
    }

    public static Scanner methodReturn() {
        return new Scanner(System.in);
    }

}
