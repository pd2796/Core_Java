package Java8Test.DefaultAndStaticInterface;

import abst.Test;

interface TestInterface
{
    public void square(int a);

    default void show()
    {
        System.out.println("i am default");
    }
}
public class defaultIntdemo implements TestInterface{
    public void square(int a)
        {
            System.out.println(a*a);
        }


    public static void main(String[] args) {
        defaultIntdemo i = new defaultIntdemo();
        i.show();
    }

}
