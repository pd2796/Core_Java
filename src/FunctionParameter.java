public class FunctionParameter {
    //double is function return type
    public static double calculateMealPrice(double listedMealPrice,
                                          double tipRate,
                                          double taxRate) {
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tax + tip;
        System.out.println("Your total meal price is " + result);
        return result*5;  // we use double so we need to return value and return value display in your final result
    }


    public static void main(String a[])
    {

            double groupMealPrice = calculateMealPrice( 100.1,.5,.78);
        System.out.println(groupMealPrice);   // system.out.println is built in function in java println() is a function

        double individualPrice = groupMealPrice/5;
        System.out.println(individualPrice);
    }
}
