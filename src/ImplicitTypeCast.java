public class ImplicitTypeCast {
    public static void main(String a[])
    {
        byte b = 100;
        int i = b;
        System.out.println(i);
        long l = i;

        char ch = 'A';
        int x  = ch;
        System.out.println(x);
    }
}
