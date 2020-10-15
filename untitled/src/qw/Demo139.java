package qw;

public class Demo139 {
    public static void main(String[] args) {
        char[] chars = "hello".toCharArray();
        int len = chars.length;
        System.out.println(len);
        System.out.println(chars[2]);

        byte[] bytes = "hello".getBytes();
        System.out.println(bytes[1]);

        //replace,可用于屏蔽词汇
        String str1 = "What are you fucking doing?";
        String str2 = str1.replace("fuck","****");
        System.out.println(str2);
    }
}
