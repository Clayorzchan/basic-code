package practice.clay.day02.demo3;

import java.util.*;

public class Demo04RandomGuess {

    public static void main(String[] args) {
        int r = new Random().nextInt(10) + 1;//产生随机数
        System.out.println(r);
        Scanner sc = new Scanner(System.in);//创造scanner类的对象sc，键盘输入
        int time = 0;
        System.out.println("Start guess!!");
        while (true) {
            //直到猜对才退出
            time++;
            int guess = sc.nextInt();

            if (time >= 5) {
                System.out.println("You have no chances.");
                System.out.println("Fail!!!");
                break;
            } else if (guess == r) {
                System.out.println("Time = " + time);
                System.out.println("Correct!! Congratualtions");
                break;
            } else if (guess < r) {
                System.out.println("Your guess number is smaller than random number.");
            } else if (guess > r) {
                System.out.println("Your guess number is larger than random number.");
            } else {
                System.out.println("Error guess format.");
            }
        }




    }
}
