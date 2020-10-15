package clay.practice.day6.p1;

public class Demo04StringConvert {
    public static void main(String[] args) {

        char[] a = "Hello".toCharArray();
        System.out.println(a[2]);
        System.out.println(a.length);


        byte[] bytes = "Hello".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }


        String str3 = "Hello".replace("ll","l");
        System.out.println(str3);
    }
}
