package clay.practice.day6.p1;

public class DemoEquals {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        char[] ch1 = {'a','b','c'};
        String str3 = new String(ch1);

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str3.equals("abc"));//不推荐这么写,可能出现空指针错误
        System.out.println("abc".equals(str3));//推荐这么写

        String str4 = "ABC";
        System.out.println("abc".equals(str4));//false
        System.out.println("abc".equalsIgnoreCase(str4));//true


    }
}
