package ExceptionHandling;

import java.util.Scanner;

public class Division {


    public static void main(String[] args) {

        int a, b, c;
        try{
        System.out.println("enter strings");
        Scanner obj = new Scanner(System.in);
        a = obj.nextInt();
        b = obj.nextInt();
        c = a/b;
        System.out.println("result"+c);
    }catch(ArithmeticException e){
            System.out.println("do not enter 0");
        }
    }
}
