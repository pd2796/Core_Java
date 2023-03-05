package Java8Test.DefaultAndStaticInterface;


interface Teststaic{

    static void method1()
    {
        System.out.println("i am static");
    }
    default void mn()
    {
        System.out.println("this is defualt from test static");
    }
}
interface Teststatic2{
    default void mn()
    {
        System.out.println("this is defualt from test static2");
    }

}


public class staticdemoEx implements Teststaic,Teststatic2{
    public static void main(String[] args) {
        Teststaic.method1();
        staticdemoEx s = new staticdemoEx();
        s.mn();
        Teststaic t = new staticdemoEx();
        t.mn();
        Teststatic2 t2 = new staticdemoEx();
        t2.mn();

    }

    @Override
    public void mn() {
        System.out.println("this is wrong");
    }
}
