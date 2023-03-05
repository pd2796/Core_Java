package collection.Map;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentitiHashmapDemo {

    public static void main(String[] args) {
        Map<Integer,String> map = new IdentityHashMap<>();
        Map<Integer,String> map1 = new HashMap<>();

        Integer id1 = new Integer(10);
        Integer id2 = new Integer(10);

        map.put(id1,"parth");
        map.put(id2,"yash");
        map1.put(id1,"parth");
        map1.put(id2,"yash");

        System.out.println(map);
        System.out.println(map1);


    }
}
