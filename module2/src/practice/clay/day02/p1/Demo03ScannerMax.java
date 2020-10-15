package practice.clay.day02.p1;

import java.util.Scanner;

public class Demo03ScannerMax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Number 1 = ");
        int a = in.nextInt();
        System.out.print("Number 2 = ");
        int b = in.nextInt();
        System.out.print("Number 3 = ");
        int c = in.nextInt();
//倒手的那个
        int temp = a>b ? a:b;
        int max = temp>c ? temp:c;
        System.out.println("Max = " + max);

    }
}
