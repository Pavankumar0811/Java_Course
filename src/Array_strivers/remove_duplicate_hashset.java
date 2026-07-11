package Array_strivers;

import java.util.HashSet;

public class remove_duplicate_hashset {
    static void main(String[] args) {


        int[] arr = {1, 2, 1, 3, 2, 4, 5};
        int k = removeDuplicates(arr);
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }


    static int removeDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (!set.contains(arr[i])) {  // not seen before
                set.add(arr[i]);        // mark as seen
                arr[j] = arr[i];        // place at j
                j++;
            }
        }
        return j;
    }
}
