package collection.set;

import collection.Comparator.StringComparator;

import java.util.Set;
import java.util.TreeSet;

public class StringaTreeSet {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>( new StringComparator());
        set.add("abcsdadsad");
        set.add("xyzsadasdas");
        set.add("defzzzzzzzzzzz");
        set.add("mno");

        for (String obj:set
             ) {
            System.out.println(obj);
        }

    }
}
