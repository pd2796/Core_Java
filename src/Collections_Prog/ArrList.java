package Collections_Prog;

import Java8.A;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

public class ArrList {
    public static void main(String[] args) {
        ArrayList al = new ArrayList<>();

        al.add(0,55);
        al.add(1,56);
        al.add(2,57);

        ArrayList<Integer> al2 = new ArrayList<>();

        al2.add(1);
        al2.add(2);
        al2.add(3);

        Vector v1 = new Vector();

        v1.add(1);
        v1.add(1);
        v1.add(1);
        v1.add(1);

        System.out.println(v1);

        al.addAll(1,al2);

        al.set(2,22);

        System.out.println(al);
    }
}
