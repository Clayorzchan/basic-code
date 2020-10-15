package practice.clay.day01.p4;

import java.util.Arrays;

public class Demo07Reverse {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        for (int min = 0, max = array.length - 1; min < max; min++, max--) {
            int temp = array[min];
            array[min] = array[max];
            array[max] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        int[] result = calculate(20,13,0);
        System.out.println(result[0]);
        System.out.println(result[1]);

        System.out.println(Arrays.toString(array));

    }

    public static int[] calculate(int a, int b, int c) {
        int[] solution = new int[2];
        int sum = a + b + c;
        int avg = sum / 3;
        solution[0] = sum;
        solution[1] = avg;
        return solution;//返回其实是地址值
    }
}