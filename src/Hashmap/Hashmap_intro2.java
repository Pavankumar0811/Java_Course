package Hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmap_intro2 {
    static void main(String[] args) {
        HashMap <String,Integer> map = new HashMap<>();

        map.put("pavan",10);
        map.put("bhavana",10);
        map.put("majula",10);
        map.put("pavan",20);

        System.out.println(map);  // all element in map

        System.out.println(map.get("pavan"));  // it will give value
        System.out.println(map.get("bhav"));   // its not exist thus its print null

        System.out.println(map.containsKey(("pavan")));  // it contain in key thus it give true
        System.out.println(map.containsValue(1));       // it contain in value thus it print true

        for(Map.Entry<String,Integer> e:map.entrySet() ){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }


         Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key + ": " + map.get(key));
        }

    }
}
