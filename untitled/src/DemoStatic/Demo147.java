package DemoStatic;

public class Demo147 {
    static{
        System.out.println("静态代码块执行");
    }

    public Demo147() {
        System.out.println("构造方法执行");
    }


    //当第一次用到本类时，静态代码块执行唯一一次
}
