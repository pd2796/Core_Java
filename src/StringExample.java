import java.util.Date;

public class StringExample {
public static void main(String a[])
{
    String s = 20 + " Total";
    System.out.println(s);

    String s1 = "hello";
    String s2 = "Hello";
    String s3 = "Welcome to India!...";
    System.out.println("Length of string: " + s3.length());
    System.out.println("Position of string is: " +s3.indexOf("India"));
    System.out.println("Position of SubString is: " +s3.substring(11));
    System.out.println("Trim white spaces: " +s3.trim());

    Date time = new Date();
    time.getTime();
    System.out.println(time);
    
    
    




    if(s1.equals(s2))
    {
        System.out.println("yes");
    }
    else {
        System.out.println("No");
    }
    if(s1.equalsIgnoreCase(s2))
    {
        System.out.println("yes");

    }
    else {
        System.out.println("No");
    }
}
}

