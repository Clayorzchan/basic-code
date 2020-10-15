package DemoExtends;

public class Zi extends Fu{
    int num = 20; //子类的成员变量：this.num

    public void method(){
        int num = 30; //局部变量：  直接写
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }
}
