package qw;

public class Demo141 {
    public static void main(String[] args) {
        int[] array = {1,2,3};
        String str = arrayToString(array);
        System.out.println(str);
    }

    public static String arrayToString(int[] array){
        String str1 = "[";
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1) {
                str1 = str1.concat(String.valueOf(array[i]) + "#") ;
            } else {
                str1 = str1.concat(String.valueOf(array[i]) + "]");
            }
        }//string可以直接+数值类型当拼接使用 int a = 1； str1 = str1 + a；
    return str1;
    }
}
