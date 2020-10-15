package DemoPhone;

public class NewPhone extends Phone{

    @Override
    public void show() {
        super.show();
        System.out.println("显示来源地");
        System.out.println("显示姓名");
    }
}


