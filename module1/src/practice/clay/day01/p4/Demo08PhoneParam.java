package practice.clay.day01.p4;

public class Demo08PhoneParam {
    public static void main(String[] args) {
        ClassTest clay = new ClassTest();
        System.out.println("ooo");
        clay.ID = "2017200603";
        clay.major = "CE";
        clay.name = "Clay Chan";
        method(clay);
    }

    public static void method(ClassTest param) {
        if(param.name.equals("Clay Chan") ){
            System.out.println(param.name + " is good.");
        }
    }

}
