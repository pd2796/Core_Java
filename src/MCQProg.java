import java.util.Scanner;

public class MCQProg {

    public static void main(String a[])
    {
        String question = "what is the largest planet in our solar system";
        String A = "earth";
        String B = "jupiter";
        String C = "saturn";

        String correctAnswer = B;
        System.out.println(question);

        System.out.println("Choose of the following " + A + " , " + B + " or " + C + " ." );
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();

        if(correctAnswer.equals(input.toLowerCase()))
            // the tolowercase function accept bot letter capital and small without using this function you getting the error.
            // you must be assign value in small later like A = "earth" when you using tolowercase other wise it dose not working
            {
            System.out.println("Right My Boy");
        }else
        {
            System.out.println("oooooh sorry this is wrong answer" + correctAnswer);
        }
    }
}
