package Deadlocks;

public class SecondResource {
    public synchronized void method1(Firstresource fr) {
        System.out.println("Inside method1 of SR");


        try {
            Thread.sleep(2000);
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        System.out.println("Invoking method2 of FR");
        fr.method2();
    }
public synchronized void method2(){
    System.out.println("Inside method2 of SR");
}
}
