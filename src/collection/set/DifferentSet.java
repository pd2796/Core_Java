package collection.set;

import java.util.*;

public class DifferentSet {
    public static void main(String[] args) {
        Random obj = new Random();

       // LinkedHashSet<Integer> set = new LinkedHashSet<>();
        //Set<Integer> set = new HashSet<>();
        Set<Integer> set = new TreeSet<>();
        for(int i = 1;i<=5;i++){
            int number = obj.nextInt(100);
            set.add(number);
            System.out.println(number);
        }
        //System.out.println("Hash set  :-  " + set);
        //System.out.println("LinkedHash set  :-  " + set);
        System.out.println("Tree set : - " +set);

        Iterator<Integer> itr = set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
            itr.remove();
        }
        System.out.println(set);
    }

}
