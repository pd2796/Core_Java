import java.util.Scanner;

public class WhileLoop {

    public static void main(String a[])
    {
        Scanner input = new Scanner(System.in);
        boolean isOnRepeat = true;
        while(isOnRepeat)
        {
            System.out.println("Playing current song");
            System.out.println("Would you like to take this song repeat ? ");
            String userInput = input.next();

            if(userInput.equals("no")) // string equals method
            {
                isOnRepeat = false;
            }

        }
        System.out.println("Playing next song");
    }
}
