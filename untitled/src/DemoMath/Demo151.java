package DemoMath;
/*
-10。8 到 +5。9 之间，绝对值大于6或者小于2。1的整数有多少个
 */
public class Demo151 {
    public static void main(String[] args) {
        double min = -10.8;
        double max = 5.9;
        int count = 0;

        for(int i = (int)min ; i < max ; i++){
            int abs = Math.abs(i);
            System.out.println(i +  " " + abs);
            if (abs > 6 || abs < 2.1)
            count++;
        }

        System.out.println(count);

    }

}
