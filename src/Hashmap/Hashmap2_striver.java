package Hashmap;

// leetcode 347 & 169

import java.util.*;

public class Hashmap2_striver {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,1,3,3,4,5,1,3};
        System.out.println("Most frequent: " + findHighest(arr));
    }

    public static int findHighest(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // count frequency
        for(int i = 0; i < arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        // find highest frequency element
        int maxCount = 0;
        int result = -1;

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > maxCount){
                maxCount = entry.getValue();
                result = entry.getKey();
            }
        }
        return result;
    }
}
