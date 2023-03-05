package Java8Test;

public class striictFP {
    public strictfp double sum()
    {

        double num1 = 10.5e+10;
        double num2 = 6e+08;

        // Returning the sum
        return (num1 + num2);
    }

    // Method 2
    // Main driver method
    public static void main(String[] args)
    {

        // Creating object of class in main() method
        striictFP t = new striictFP();

        // Here we have error of putting strictfp and
        // error is not found public static void main method
        System.out.println(t.sum());
    }
}
