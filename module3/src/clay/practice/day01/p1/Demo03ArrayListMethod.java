package clay.practice.day01.p1;

import java.util.ArrayList;

public class Demo03ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);
        //添加元素
        boolean success = list.add("Clay");
        System.out.println(list);
        System.out.println("是否添加上： " + success);
        System.out.println("================");

        String a = list.get(0);
        System.out.println("get的值是： " + a);
        System.out.println("===============");

        list.add("Ayer");
        System.out.println(list);
        String b = list.get(1);
        System.out.println(list.get(1));


        String whoRemoved = list.remove(1);
        System.out.println(whoRemoved);//输出被删除的元素

        int len = list.size();
        System.out.println(len);
    }
}
