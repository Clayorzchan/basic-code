package clay.practice.day6.p1;

import java.util.Scanner;

public class Demo07StringCount {
    //p142
    //键盘输入一个字符串
    //数不同种类的字符在输入字符串中的个数
    public static void main(String[] args) {
        System.out.print("Please input String: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char[] charArray = input.toCharArray();
        int countCapital = 0, countSmall = 0, countNumber = 0, countOther = 0;
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if ('A'<= ch && ch <= 'Z') {
                countCapital++;
            }else if('a' <= ch && ch <= 'z'){
                countSmall++;
            }else if('0' <= ch && ch <= '9'){
                countNumber++;
            }else{
                countOther++;
            }
        }

        System.out.println("Capital: " + countCapital);
        System.out.println("Small: " + countSmall);
        System.out.println("Number: " + countNumber);
        System.out.println("Other: " + countOther);
    }
}
