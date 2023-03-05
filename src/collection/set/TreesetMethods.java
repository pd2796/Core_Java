package collection.set;

import java.util.TreeSet;

public class TreesetMethods {
    public static void main(String[] args) {
        TreeSet<Integer> s = new TreeSet<>();

        s.add(10);
        s.add(20);
        s.add(30);
        s.add(40);
        s.add(50);

        System.out.println(s);

        System.out.println(s.ceiling(10));
        System.out.println(s.higher(40));
        System.out.println(s.floor(10));
        System.out.println(s.lower(40));
        System.out.println(s.pollFirst());
        System.out.println(s.pollLast());
        System.out.println(s.descendingSet());





    }
}
