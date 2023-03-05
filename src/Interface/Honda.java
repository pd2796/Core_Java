package Interface;

public class Honda implements Car{
    @Override
    public void go() {
        System.out.println("inside hondas go");
    }

    @Override
    public void stop() {
        System.out.println("inside honda stop");
    }
}
