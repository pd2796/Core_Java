package Java8Test.functionalInterface;

import java.util.function.Function;

public class intFunctional {

    public static void main(String[] args) {
        Function<Integer,Double> half = a -> a/2.0;
        half = half.andThen(a->3*a);

        System.out.println(half.apply(10));
        try {
            half = half.andThen(null);
        }
        catch (Exception e)
        {
            System.out.println("This is null pointer :- " + e);
        }
    }
}
