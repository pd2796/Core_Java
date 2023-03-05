package Java8;




public class LambdaExp  {

    public static void main(String[] args) {


    A a = ()-> System.out.println("Inside myMethod");

    a.myMethod();

    sum s = (x,y)-> System.out.println("Sum is :- "+(x+y));
    s.myMethod(500,2000);
    }


}
