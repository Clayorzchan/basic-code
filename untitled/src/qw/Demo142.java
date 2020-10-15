package qw;

import java.util.Scanner;

public class Demo142 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input : ");
        String str = sc.next();
        char[] chars = str.toCharArray();
        int num = 0,smallNum = 0,capitalCharNum = 0;
        int other = 0;

        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if ('a' <= ch && ch <= 'z') {
                smallNum++;
            } else if('A' <= ch && ch <= 'Z'){
                capitalCharNum++;
            }else if ('0' <= ch && ch <= '9'){
                num++;
            }else other++;
        }

        System.out.println("小 ：".concat(String.valueOf(smallNum)));
        System.out.println("大 ：" + capitalCharNum);
        System.out.println("数字 ：" + num);
        System.out.println("其他 ：" + other);

    }
}
