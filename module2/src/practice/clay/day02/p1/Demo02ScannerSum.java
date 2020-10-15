package practice.clay.day02.p1;

import java.util.Scanner;

public class Demo02ScannerSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int param1 = in.nextInt();
        int param2 = in.nextInt();
        int sum = param1 + param2;
        System.out.println("Result : " + sum);

    }
}
