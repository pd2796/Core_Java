package collection.set;

import java.util.*;

public class setDemo {
    public static void main(String[] args) {
        Random obj = new Random();

        List<Integer> list = new ArrayList<>();
        for (int i = 1;i<=10;i++)
        {
            int number = obj.nextInt(5);
            list.add(number);
        }
        System.out.println("List :- " + list);
        Set<Integer> set = new HashSet<>(list);
        System.out.println("Set : - " + set);
    }
}
