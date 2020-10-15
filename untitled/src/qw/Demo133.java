package qw;

public class Demo133 {
    public static void main(String[] args) {
        byte[] byteArray = {97,98,99};
        String str1 = new String(byteArray);
        boolean judge = "abc".equals(str1);

        System.out.println(str1);
        System.out.println(judge);
    }
}
//equals方法具有对称性，推荐把常量字符串写在前面