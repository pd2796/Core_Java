import java.util.Scanner;

public class ControllStatement {

        public static void main(String s[]) {

            Scanner scanner = new Scanner(System.in);  // Scanner is a datatype
            System.out.println("Please enter the Number");
            int studentNumber = scanner.nextInt();

            if(studentNumber < 5)
            {
                int a = 10;  // This variable access only within this block
                System.out.println("Enjoy the good luck friends bring you");
            }
            else
            {
                // you can not acces the "a" variable here
                System.out.println("Sorry");
            }
// you can not acces the "a" variable also here


        }
    }


