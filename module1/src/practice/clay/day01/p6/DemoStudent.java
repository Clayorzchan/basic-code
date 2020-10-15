package practice.clay.day01.p6;

public class DemoStudent {
    public static void main(String[] args) {
        Student stu1 = new Student();
        //会到Student类中找到这个构造方法执行到新建对象 stu1 上
        Student stu2 = new Student("Clay", 21);
        //找到Student类中执行有参构造方法到这个对象 stu2 上
        stu1.setName("Jackson Wong");
        System.out.println(stu1.getName());
        System.out.println(stu2.getName());
    }
}
