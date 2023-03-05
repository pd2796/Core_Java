public class DataType {
    /*
    Types of java application
    web application
    mobile application
    desktop application
    web servers
    Embedded systems
    Others

    What is JRE?
    Java run time enviournment when you install JDK it automatically install*/
    public static void main(String s[])
    {
        int studentAge = 15;
        double studentGPA = 3.45;
        //char studentFirstInitial = 'k';

        //char studentLastInitial = 'h'; // char stor only latter
        boolean hasPerfectAttendance = true; // primitive data type int,char,double,boolean
        String studentName = "Parth Patel"; // refrance data type string
        String studentLastName = "Patel"; // string store whole word or statement
        char studentFirstInitial = studentName.charAt(0);  // 0 is a index value we can print char using index wise
        char studentLastInitial = studentLastName.charAt(3);



        System.out.println(studentAge);
        System.out.println(studentGPA);
        System.out.println(studentFirstInitial);
        System.out.println(studentLastInitial);
        System.out.println(hasPerfectAttendance);
        System.out.println(studentName);
        System.out.println(studentLastName);




    }
}