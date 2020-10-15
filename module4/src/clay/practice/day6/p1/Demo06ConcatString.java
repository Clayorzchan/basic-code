package clay.practice.day6.p1;

//p141
public class Demo06ConcatString {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String result = arrayToString(array);
        System.out.println(result);
    }

    public static String arrayToString(int[] array) {
        String str = new String();
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                str = str.concat("[" + "word" + array[i] + "#");
            } else if (i == array.length - 1) {
                str = str.concat("word" + array[i] + "]");
            } else {
                str = str.concat("word" + array[i] + "#");
            }
        }
        return str;
    }
}
