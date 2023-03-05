public class StringArray {

    public static void main(String a[])
    {
        String[] months = {"January","February","March","April","May","June","July","August","September","October","November",
        "December"};
        String[] colors = new String[3];
        colors[0]="Red";
        colors[1]="Green";
        colors[2]="Blue";

        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);

        }

//
//        for (int i = 0; i < months.length; i++) {
//            System.out.println(months[i]);
//
//        }
//        for loop
//        for (String month : months)
//              {
//                  System.out.println(month);
//
//        }
//        Foreachloop

//        int whilecounter = 0;
//        while (whilecounter < months.length)
//        {
//            System.out.println(months[whilecounter]);
//            whilecounter++;
//        } while loop
        int docounter = 0;

       do {
            System.out.println(months[docounter]);
            docounter++;
        }while (docounter < months.length);


    }

}