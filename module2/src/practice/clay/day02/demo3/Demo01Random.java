package practice.clay.day02.demo3;
//random在util里

import java.util.Random;

public class Demo01Random {
    public static void main(String[] args) {
        Random r = new Random();
        int num1 = r.nextInt();//int类型的所有范围
        int num2 =r.nextInt(10) +1;//有界---[1,11)

        System.out.println(num1+"  " + num2 +"  "+ r.nextInt(3));
    }
}
