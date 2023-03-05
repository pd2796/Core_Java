import java.util.Scanner;

public class ScannerDataType {
    public static void main(String s[]) {
        double studentGPA = 3.45;
        String studentFirstName = "Parth";
        String studentLastName = "Patel";
        Scanner input = new Scanner(System.in);  // Scanner is a datatype
        System.out.println("Please enter the GPA");
        studentGPA = input.nextDouble();
        System.out.println(studentFirstName + " " + studentLastName + " now GPA is " + studentGPA);
    }
}
