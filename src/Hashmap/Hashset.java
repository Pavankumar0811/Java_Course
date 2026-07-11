package Hashmap;

import java.util.*;      // to import all library

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
    static void main(String[] args) {
     HashSet<Integer> set = new HashSet<>();
     set.add(1);
     set.add(2);
     set.add(3);
     set.add(4);
     set.add(5);


     if(set.contains(6)){
         System.out.println("true");
     }else{
         System.out.println("false");
     }
     if(!set.contains(5)){    // it will make it reverse !
         System.out.println("true");

     }else{
         System.out.println("false");
     }

     set.remove(5);
     if(!set.contains(5)){
         System.out.println("it does not contain now");
     }

        System.out.println(set.size());

        System.out.println(set);

        // iterator we should have to import package to use this

        Iterator itr = set.iterator();
        while(itr.hasNext()){      // this is
            System.out.println(itr.next());
        }
    }
}
