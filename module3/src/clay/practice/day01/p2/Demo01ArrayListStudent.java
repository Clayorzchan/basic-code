package clay.practice.day01.p2;

import java.util.ArrayList;

public class Demo01ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student one = new Student("ooo", 16, true);
        Student two = new Student("aaa", 32, false);
        Student three = new Student("bbb", 344, true);
        Student four = new Student("ccc", 90, false);

        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName() + "   " + stu.getAge());
        }


    }
}
