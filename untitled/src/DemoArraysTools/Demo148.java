package DemoArraysTools;

import java.util.Arrays;

//java.util.Arrays是一个与数组相关的工具类，
//里面提供了大量静态方法，用来实现数组相关操作
public class Demo148 {
    public static void main(String[] args) {
        int[] intArray = {1,2,3};

        //toString静态方法：将数组变为String 返回值String
        //public static String toString(数组)
        String str = Arrays.toString(intArray);
        System.out.println(str);
        //output:  [1,2,3]


        //public static void sort(数组)
        // 静态方法，直接将数组排好序（从小到大）
        //输入的数组被排好序
        int[] intArr = new int[]{1,3,0,6,3};
        Arrays.sort(intArr);//此方法返回类型void
        System.out.println(Arrays.toString(intArr));
    }
}
