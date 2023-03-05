public class Triangle {
    public static void main(String a[])
    {
        Constructors cnst1 = new Constructors(15,8,15,8,5);
        Constructors cnst2 = new Constructors(3,20.50,6,8,9);

        double triangleArea = cnst1.findArea();
        System.out.println(triangleArea);

        double triangleBArea = cnst2.findArea(); // call using cunsctore instance
        System.out.println(triangleBArea);

        System.out.println(cnst1.sideLenOne); // accessing a variable or attribute
        System.out.println(Constructors.numOfsize); // accessing the static variable using class name

    }
}
