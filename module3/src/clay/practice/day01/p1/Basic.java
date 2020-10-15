package clay.practice.day01.p1;

import java.util.ArrayList;

public class Basic {
    public static void main(String[] args) {
//        ArrayList<int> list = new ArrayList<int>();
        //泛型不能是基本类型数据，只能用引用类型
        //解决办法：使用包装类
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        System.out.println(list);

        int num = list.get(1);
        System.out.println(num);
    }
}
