import java.util.Scanner;
/*
What is the use of function?

Its reduce the code and when we when you want to change you do not need to change code only change the function.
you can use one and more time for same thing so its reduce the code

Its series of finite steps.
we can execute function many time in the programm.

*/

public class FunctionUse {
    public static void DeveloperTeaTime(){
        System.out.println("waiting for a tea time...");
        System.out.println("Type rendom word and start the developer tea time ");
        Scanner input = new Scanner(System.in);
        input.next();  // It is the local variable
        System.out.println("Its developer tea time....");
    }
    public static void main(String s[])
    {
        DeveloperTeaTime();
    }
}
