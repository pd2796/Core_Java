package DataStructure;
import java.lang.reflect.Array;
import java.util.*;
/*
Types of datastructure ?
Arraylist,LinkedList,Vector,Stack,Queue

Iterator?

it is user for traverse in linklist it is use in collection

*/
public class TypesOfDataStructure {

    public static void main(String a[])
    {
        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7,21,45,55);              //Array LIst
        System.out.println("Position of 21: " + Collections.binarySearch(list1,21));
        Collection collection = Arrays.asList("red","green","blue","indigo","violate");
        Iterator iterator = collection.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
