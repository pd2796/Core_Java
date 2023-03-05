package ExceptionHandling;

public class UncheckedTest {
    public static void main(String[] args) throws CheckExp {
       // throw new UncheckedCustomException("Business Exception occured");
        throw new CheckExp("needs to be handle");
    }
}
