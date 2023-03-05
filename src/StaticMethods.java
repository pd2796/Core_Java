public class StaticMethods {
    public static void main(String[] a){
        System.out.println("123");
        StaticMethods.method1();
    }

    static void method1()
    {
        System.out.println("Inside method 1 ");
    }
    static {
        System.out.println("xyz");
        StaticMethods.method1();
    }
}
