public class TryCatch {
// In this programm string has not any value but programm still run and print stamenent because we use try and catch
    // String return nullpoint exception but run the progrram
    // we can use different type of exception in java here we use Exception
    public static void main(String a[])
    {
        String s = null;
        try {
            String sub = s.substring(1);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("I am not ded yet");
    }
}
