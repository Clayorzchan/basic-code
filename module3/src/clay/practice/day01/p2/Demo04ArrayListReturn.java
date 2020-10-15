package clay.practice.day01.p2;

import java.util.ArrayList;
import java.util.Random;

/*
* 创建一个集合，存放20个随机数字，筛选偶数放到小集合中
* 要求使用自定义的方法来实现筛选
*
* */
public class Demo04ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> littleList = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(100);
            list.add(num);
        }
        System.out.println(list);
        System.out.println(list.size());
        System.out.println("================================");

        ArrayList<Integer> smallList = filter(list);


        System.out.println(smallList);
        System.out.println(smallList.size());

        return;
    }

    public static ArrayList<Integer> filter(ArrayList<Integer> list){
        ArrayList<Integer> even = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) % 2 ==0){
                even.add(list.get(i));
            }
        }
        return even;
    }
}
