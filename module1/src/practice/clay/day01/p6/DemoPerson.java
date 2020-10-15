package practice.clay.day01.p6;

public class DemoPerson {
    static String name = "Member";
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Clay Chan";
        System.out.println(person);
        person.sayHello(name);


    }
}