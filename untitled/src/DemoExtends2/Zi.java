package DemoExtends2;

public class Zi extends Fu {
    public void methodZi(){
        System.out.println("子类方法执行");
    }

    @Override
    public Integer method(){
        System.out.println("子类重名方法执行");
        int a = 100;
        return a;
    }
}
