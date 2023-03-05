class Outer{

    class Inner{

        public void show(){
            System.out.println("This is show from inner class");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        Outer.Inner in = new Outer().new Inner();

        in.show();
    }



}
