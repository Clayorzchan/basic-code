package clay.practice.day01.p1;

import java.util.ArrayList;

//数组长度不能发生改变
//但是ArrayList长度可以改变

//对于ArrayList来说E代表反映，集合当中的所有元素是什么类型
//泛型只能是引用类型，不能是基本类型
public class Demo02ArrayList {
    public static void main(String[] args) {
        //创建ArrayList全都是String类型的元素
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);

        list.add("Chan");
        System.out.println(list);
        list.add("Clay");
        list.add("Clay");
        list.add("Clay");
        System.out.println(list);
    }
}
