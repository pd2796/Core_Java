package ExceptionHandling;

public class arrIndex {
    int method1(){
        return 0;
    }
    public static void main(String[] args) {
        int aa[] = {10,20,30};
       try {

           System.out.println("this is");
           for (int i = 0; i < 5; i++) {
               System.out.println(aa[i]);

           }
       }catch (ArrayIndexOutOfBoundsException e){
           System.out.println("outttttttt");
       }
        System.out.println("arrya output");

    }
}
