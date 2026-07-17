package Array_strivers;

import java.util.*;

public class leaders_in_array_optimal {
    static void main(String[] args) {
        int[] arr = {10,22,12,3,0,6};
        System.out.println(main1(arr));
    }

    static List<Integer> main1(int[] arr) {

            List<Integer> list = new ArrayList<>();
            int n = arr.length;
            int maxFromRight = arr[n - 1];

            // rightmost element is always a leader
            list.add(maxFromRight);

            for (int i = n - 2; i >= 0; i--) {
                if (arr[i] >= maxFromRight) {
                    maxFromRight = arr[i];
                    list.add(arr[i]);
                }
            }

            Collections.reverse(list); // to maintain original left-to-right order
            return list;
        }
}
