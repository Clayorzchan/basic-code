package practice.clay.day02.p2;

public class Person {
    //成员变量
    int age;
    String name;
    String gender;

    //构造方法
    public Person(int age, String name, String gender) {
        this.age = age;
        this.name = name;
        this.gender = gender;
    }

    public Person() {
    }


    //成员方法
    public void setAge(int age){
        if (age < 0 || age >=120 ){
            this.age = age;
        }else {
            System.out.println("error age. please enter again");
        }
    }

    public int getAge(){
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public void show(){
        System.out.println("Name : " + name +" Age : " + age + " Gender " + gender);
    }
}
