package DemoExtends;

public class Demo154 {
    public static void main(String[] args) {
        int b = Employee.age;
//        Teacher teacher = new Teacher();
        Teacher.age =  100;

        System.out.println(Teacher.age);
        System.out.println(b);
    }
}
