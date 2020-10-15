package DemoStatic;

public class Demo144 {
    public static void main(String[] args) {
        Student person1 = new Student("A",18);
        Student person2 = new Student();
        Student person3 = new Student("B",29);

        person1.room = ("class 1");
        System.out.println(person2.room);
        System.out.println(person3.room);
        System.out.println("===========");

        System.out.println(person1.getId());
        System.out.println(person2.getId());
        System.out.println(person3.getId());
    }
}
