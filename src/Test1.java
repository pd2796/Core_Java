abstract class a{
    private void mp(){
        System.out.println("raja");
    }
    abstract void l();
        }

public class Test1 extends a {

    void l()
    {
        System.out.println("ssss");
    }
    public static void main(String[] args) {
    a a1 = new Test1();
        a1.l();

    }
}
