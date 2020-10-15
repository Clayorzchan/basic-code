package practice.clay.day01.p4;

public class Demo04Overload {
    public static void main(String[] args) {
        int i = 1, j =3;
        System.out.println(sum(i,j,4));
        System.out.println(sum(1,2));
        System.out.println(sum(1,2,3,4));
        System.out.println("==================");
    }

    public static int sum(int f, int b){
        return f + b;
    }
    public static int sum(int a, int b,int c){
        return a + b + c;
    }
    public static int sum(int a, int b, int c , int d){
        return a + b + c + d;
    }

}
