package clay.practice.day01.p2;

import java.util.ArrayList;

public class Demo03ArrayListPoint {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("张翠山");
        list.add("张三丰");
        list.add("宋远桥");
        //System.out.println(list);
        printArrayList(list);
    }

    public static void printArrayList(ArrayList<String> list) {
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
           if (i == list.size() - 1) {
                System.out.println(list.get(i) + "}");
            }else {
               System.out.print(list.get(i) + "@");
           }

        }
    }

}
//以指定格式打印集合的方法

/*
 * 定义方法三要素：返回值类型，参数列表，方法名称
 *
 *
 * */