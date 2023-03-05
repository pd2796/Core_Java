class Outer1
{
    void outerMethod()
    {
        System.out.println("this is outer");

        class Inner{
            void innermethod(){
                System.out.println("i am pote inner");
            }


        }
        Inner ip = new Inner();
        ip.innermethod();
    }
}


public class MethodwithInner {
    public static void main(String[] args) {

        Outer1 o = new Outer1();
        o.outerMethod();
    }
}
