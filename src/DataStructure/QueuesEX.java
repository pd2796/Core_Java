package DataStructure;

import java.util.LinkedList;
import java.util.Queue;
// its work like linerlist add from one end and delete from other end
public class QueuesEX {
    public static void main(String a[])
    {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i <=10 ; i++) {
            queue.add(i);
        }
        System.out.println("Print Element : " +queue);
        int removed = queue.remove();
        System.out.println(removed + " Was Removed");

        int top = queue.peek();
        System.out.println("Top element : "+top);

        System.out.println(queue);
    }
}
