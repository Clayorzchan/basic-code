package DemoExtendsConstructor;

public class Zi extends Fu {

    public Zi(){
        super(); //可以不写，强制赠送隐含构造方法
        System.out.println("子类构造方法");
    }
}
