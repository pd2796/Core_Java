import java.util.*;
interface Test
{
    interface Yes
    {
        void show();
    }
}

class Testing implements Test.Yes
{
    public void show()
    {
        System.out.println("show method of interface");
    }
}

class NestedInterface
{
    public static void main(String[] args)
    {
        Test.Yes obj = new Testing();
      //  Testing t = new Testing();
       // obj = t;
        obj.show();
    }
}