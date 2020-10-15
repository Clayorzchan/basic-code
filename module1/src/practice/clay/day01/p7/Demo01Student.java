package practice.clay.day01.p7;

import java.util.Scanner;

public class Demo01Student {
    public static void main(String[] args) {
        Student clay = new Student();
        clay.setName("Clay Chan");
        clay.setAge(21);

        Student ayer = new Student(22, "Ayer Shi");

        System.out.println(clay.getName() + "  " + clay.getAge());
        System.out.println(ayer.getName() + "  " + ayer.getAge());

    }
}
