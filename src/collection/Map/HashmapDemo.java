package collection.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashmapDemo {

    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("parth",10);
        map.put("raj",20);
        map.put("yash",5);
        map.put("pinakin",35);

        Set<String> keySet = map.keySet();
        System.out.println("keys:- "+keySet);
        Collection<Integer> values = map.values();
        System.out.println("Values"+values);
       Collection<Integer> value=  map.values();
        System.out.println("values :- "+value);

        for(String key:keySet){
            System.out.println("Key : - " +key + "value :- " +map.get(key));
        }

    }
}
