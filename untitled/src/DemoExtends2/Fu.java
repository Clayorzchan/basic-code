package DemoExtends2;


public class Fu {
    public void methodFu(){
        System.out.println("父类方法执行");
    }

    Object method(){
        System.out.println("父类重名方法执行");
        return null;
    }
}
