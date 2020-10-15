package clay.practice.day6.p1;

import java.util.Scanner;

public class Demo03Substring {
    public static void main(String[] args) {
        char[] ch1 = new char[]{'a','b','c','d','e','f'};
        String str = new String(ch1);
        str = "abdfffffffff";
        System.out.println(str);
        String str1 = str.substring(2,5);
        System.out.println(str1);


    }
}
