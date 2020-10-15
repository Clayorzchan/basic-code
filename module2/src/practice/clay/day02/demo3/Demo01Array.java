package practice.clay.day02.demo3;

public class Demo01Array {
    //定义数组,存储三个Person的对象(意思就是三个Person类的对象是数组中的三个元素)
    //数组长度程序运行期间不能改变
    public static void main(String[] args) {
        Person[] array = new Person[3];

        Person one = new Person(18,"clay");
        Person two = new Person(29,"Chan");
        Person three = new Person(32,"xxx");

        array[0] = one;
        array[1] = two;
        array[2] = three;

    }
}
