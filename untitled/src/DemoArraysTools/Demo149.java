package DemoArraysTools;

import java.util.Arrays;
import java.util.Random;

public class Demo149 {

    public static void main(String[] args) {

        String str = "sdfwejfkbgwejkfbqiKKDF";
        char[] chars = str.toCharArray();

        Arrays.sort(chars);

        for (int i = chars.length-1; i >= 0; i--) {
            System.out.print(chars[i]);
        }

    }
}
