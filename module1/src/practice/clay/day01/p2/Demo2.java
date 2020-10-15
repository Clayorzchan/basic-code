package practice.clay.day01.p2;

public class Demo2 {
    public static void main(String[] args) {
//        printMethod();
        int a = 3;
        int b = 3;
        printSum(a , b );
//        System.out.println(sumInt(b, a));
    }

    public static void printMethod() {
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 20; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static int sumInt(int a, int b) {
        int result = a + b;
        return result;
    }

    public static void printSum(int a, int b) {
        System.out.println("Sum = "+ (a+b));
    }
}
