package Java8.metgodref;

public class consRef {
    public static void main(String[] args) {
        MyInterface f1 = s->new Myclass(s);

        f1.get("Using Lambdas");

    }
}
