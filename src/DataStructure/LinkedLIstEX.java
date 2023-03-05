package DataStructure;

import java.util.LinkedList;
import java.util.ListIterator;
//Link list providing remove add access the element of both of the side
public class LinkedLIstEX {

    public static void main(String a[])
    {
        LinkedList states = new LinkedList();
        states.add("A");
        states.add("B");
        states.add("C");
        states.add("D");
        states.add("E");

        states.addFirst("Z");
        System.out.println(states);
        System.out.println("Last element : " + states.getLast());
        ListIterator iterator = states.listIterator(states.size());
        while(iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}
