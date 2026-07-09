package Hashmap;

import java.util.HashMap;

public class Hashmap_intro {
    static void main(String[] args) {
    HashMap <String,Integer> find = new HashMap<>();

    find.put("pavan",1);
    find.put("bhavana",2);
    find.put("kumar",3);


//        System.out.println(find.containsKey("pavan"));
//        System.out.println(find.containsValue(2));
        System.out.println(find.get("pavan"));



//        System.out.println(find);
    }
}
