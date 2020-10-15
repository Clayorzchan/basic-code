package practice.clay.day01.p3;

public class DemoMethodSame {
    public static boolean judgeSame(int a,int b){
        return a==b;
    }

    public static void main(String[] args) {
        int a = 5,b = 5;
        System.out.println(judgeSame(a,b));
        System.out.println(judgeSame(13,12));
    }
}
