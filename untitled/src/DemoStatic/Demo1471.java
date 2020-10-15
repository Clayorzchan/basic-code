package DemoStatic;

public class Demo1471 {
    public static void main(String[] args) {
        Demo147 test = new Demo147();
        Demo147 test1 = new Demo147();
        //只出现一次"静态代码块执行"
        //静态代码块优先于构造方法，静态永远优先！！
    }
}
