package Array;

import java.util.TreeSet;

public class union_of_in2array {
    static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,6,7};
        System.out.println(main1(arr1,arr2));
    }

    static TreeSet<Integer> main1(int[] arr1 , int[] arr2) {
        TreeSet<Integer> set = new TreeSet<>();

        // normal for loop for arr1
        for(int i = 0; i < arr1.length; i++){
            set.add(arr1[i]);  // ✅
        }

        // normal for loop for arr2
        for(int i = 0; i < arr2.length; i++){
            set.add(arr2[i]);  // ✅
        }

        // print result
        return set;
    }
}
