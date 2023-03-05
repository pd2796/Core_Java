package Deadlocks;

public class Firstresource {
    public synchronized void method1(SecondResource sr){
        System.out.println("Inside method1 of FR");
    try{
        Thread.sleep(2000);

    }catch (InterruptedException e){
        e.printStackTrace();
    }
        System.out.println("Invoking method2 of SR");
    sr.method2();

    }
    public void method2(){
        System.out.println("Inside method of FR");
    }
}
