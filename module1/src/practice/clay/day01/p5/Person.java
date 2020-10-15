package practice.clay.day01.p5;

public class Person {
    private int age;
    private String name;
    private boolean male;

    public void setMale(String gender) {
        if (gender.equals("male")) {
            male = true;
        } else if (gender.equals("female")) {
            male = false;
        } else {
            System.out.println("error gender input");
        }
    }

    public boolean isMale() { //boolean类型 getter要用isXxx
        return male;
    }

    public void show() {
        System.out.println("Name: " + name + " Age: " + age + " Is male？ " + male);
    }

    //专门向private age 设置数据,其他类就可以间接访问age这个私有成员变量
    public void setAge(int num) {
        if (num >= 18 && num <= 100) {
            age = num;
        } else {
            System.out.println("error number range");
        }
    }

    public int getAge() {
        return age;
    }
    /*
     * 间接访问就是设置一对Setter/Getter
     * */

    public void setName(String n) {
        if (n.length() <= 20) {
            name = n;
        } else {
            System.out.println("wrong name length");
        }
    }

    public String getName() {
        return name;
    }
}
