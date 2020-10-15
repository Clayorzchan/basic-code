package clay.practice.day01.p1;

import java.util.*;

public class Demo04ArrayListEach {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("xiaoming");
        list.add("xiaohong");
        list.add("xiaohua");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
