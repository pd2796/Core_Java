package Exception_hand;

public class ThrowsExcep {
   
    
    
    static void fun() throws IllegalAccessException{
        System.out.println("Inside fun()");
        throw new IllegalAccessException("demo");
    }
    
    

   
    public static void main(String[] args) {

        try {
            fun();
        }catch (IllegalAccessException e){
            System.out.println("catch in main");
        }
    }
}
