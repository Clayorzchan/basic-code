package practice.clay.day01.p4;

public class Demo06Competition {
    public static void main(String[] args) {
        int[] array = {1, 2, 50, 300, 12};
        int max = array[0];
        for(int i = 1; array[i]>max ; i++){
            max = array[i];
        }
        System.out.println("Max = " + max);
    }

}
