import java.util.Scanner;

public class MethodUse {
    // Its reduce the code and we reuse the code using method

    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);

        double d1 = getInput(sc,"Enter Number 1");
        double d2 = getInput(sc,"Enter Number 2");

        double result = d1/d2;

        System.out.println("The answer is : " + result);
    }

    private static double getInput(Scanner sc,String prompt) {
        System.out.println(prompt);
        return sc.nextDouble();
    }

}
