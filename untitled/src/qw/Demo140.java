package qw;

public class Demo140 {
    public static void main(String[] args) {
        String str1 = "a,b,c";
        String[] str2 = str1.split(",");

        for (int i = 0; i < str2.length; i++) {
            System.out.println(str2[i]);
        }

        char[] chars = new char[]{97,98,99};
        String str3 = "s.d.sdfe.dfew.f";
        String[] str4 = str3.split("\\.");
        for (int i = 0; i < str4.length; i++) {
            System.out.println(str4[i]);
        }

    }
}
