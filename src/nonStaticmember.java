public class nonStaticmember {
    int num;

    nonStaticmember()
    {
        System.out.println("Inside the cunstroctor");
    }
    {
        System.out.println("Inside the non static block");
    }
    static {
        System.out.println("Inside the non static block is static block");
    }
    public static void main(String[] a){
        System.out.println("this one");
        new nonStaticmember();
        nonStaticmember n = new nonStaticmember();

        n.doSomething();


    }

    void doSomething(){
        System.out.println("Inside dosomething");
    }
}
