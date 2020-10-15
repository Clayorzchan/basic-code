package practice.clay.day02.p1;

import java.util.Scanner;

public class Demo01Scanner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);//System.in键盘输入
        String word = in.next();//得到String next()方法返回String给word
        int num = in.nextInt();//得到一个int返回，赋值给num
        System.out.println(word + num);

    }
}
