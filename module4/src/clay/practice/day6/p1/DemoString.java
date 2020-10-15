package clay.practice.day6.p1;

public class DemoString {
    public static void main(String[] args) {
        //method 1 空字符串
        String str1 = new String();
        System.out.println("第一个字符串是： "+str1);

        //method 2 用char[]
        char[] ch = {'s','d','e','g'};
        String str2 = new String(ch);
        System.out.println(ch);
        System.out.println(str2);

        //method 3 用byte[]
        byte[] byteArray = new byte[]{97,98,99};
        String str3 = new String(byteArray);
        System.out.println(byteArray);
        System.out.println(str3);

        //直接创建
        String str4= "sadfsd";



    }
}
