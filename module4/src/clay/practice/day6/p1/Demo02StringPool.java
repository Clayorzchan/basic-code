package clay.practice.day6.p1;

public class Demo02StringPool {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        char[] char1 = {'a','b','c'};
        String str3 = new String(char1);
        System.out.println(str1);
        System.out.println(str1 == str2);
        System.out.println(str2 == str3);
        System.out.println(str1 == str3);
    }
}
//程序中直接写的"abc"就在字符串常量池当中
//对于基本类型来说，==是数值比较
//对于引用类型来说，==是地址值比较