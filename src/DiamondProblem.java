interface PI1 {

    // Default method
    default void show()
    {

        // Print statement if method is called
        // from interface 1
        System.out.println("Default PI1");
    }
}

// Interface 2
interface PI2 {

    // Default method
    default void show()
    {

        // Print statement if method is called
        // from interface 2
        System.out.println("Default PI2");
    }
}
class DiamondProblem implements PI1,PI2
{

    public void show()
    {
        PI2.super.show();
        PI1.super.show();
    }
    public static void main(String[] args) {

        DiamondProblem d = new DiamondProblem();
        d.show();

    }

}
