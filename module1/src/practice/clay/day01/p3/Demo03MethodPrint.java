package practice.clay.day01.p3;

public class Demo03MethodPrint {
    public static void main(String[] args) {
        printCount(3);
        printCount(10);
    }

    public static void printCount(int i){
        int a = 1;
        while(a <= i){
            System.out.println(a);
            a++;
        }
    }
}
