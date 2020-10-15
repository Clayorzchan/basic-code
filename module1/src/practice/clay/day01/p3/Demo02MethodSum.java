package practice.clay.day01.p3;

public class Demo02MethodSum {
    public static void main(String[] args) {
        System.out.println(isSumWhile(1,2));
    }

    public static int isSum(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        return sum;
    }

    public static int isSumWhile(int a, int b){
        int sum = 0;
        while(a <= b){
            sum += a;
            a++;
        }
        return sum;
    }



}
