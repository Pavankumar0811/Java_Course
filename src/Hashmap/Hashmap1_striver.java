package Hashmap;
// 347

import java.util.*;

public class Hashmap1_striver {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,1,3,3,4,5,1};
        countFrequency(arr);
    }

    public static void countFrequency(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // count frequency
        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);  // increment count
            }else{
                map.put(arr[i], 1);  // first occurrence
            }
        }

        // print frequency
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " appears " + entry.getValue() + " times");
        }
    }
}
