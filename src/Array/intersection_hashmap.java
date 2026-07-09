package Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class intersection_hashmap {
    static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,6,7};
        System.out.println(intersection(arr1, arr2));
    }

    public static List<Integer> intersection(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        // add all arr1 elements to set
        for(int i = 0; i < arr1.length; i++){
            set.add(arr1[i]);
        }

        // check arr2 elements in set
        for(int i = 0; i < arr2.length; i++){
            if(set.contains(arr2[i])){
                result.add(arr2[i]);
                set.remove(arr2[i]);  // avoid duplicates
            }
        }
        return result;
    }
}
