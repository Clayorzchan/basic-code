package practice.clay.day01.p5;

public class DemoPerson {
    public static void main(String[] args) {
        Person person = new Person();

        person.setName("Clay Chan");
        person.getName();

        person.setAge(18);
        person.getAge();

        person.setMale("male");
        person.isMale();

        System.out.println(person);//对象哈希地址值
//        System.out.println(person.getName() + " " + person.getAge());
//        System.out.println(" Is male?" + male);
        person.show();
    }
}