package clay.practice.day01.p1;

public class Person {
    private String name;
    private int age;
    private boolean male;

    public Person(String name, int age, boolean male) {
        this.name = name;
        this.age = age;
        this.male = male;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() <= 25) {
            this.name = name;
        }else{
            System.out.println("Error name length! ");
        }
    }

    public Person() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }
}
