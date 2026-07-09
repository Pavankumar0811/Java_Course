package Array;

import java.util.ArrayList;
import java.util.List;

public class intersection_twopointer {
    static void main(String[] args) {
        int[] arr1 = {1,2,2,3,3,4,5,6};
        int[] arr2 = {2,3,3,5,6,6,7};
        System.out.println(intersection(arr1, arr2));
    }

    public static List<Integer> intersection(int[] arr1, int[] arr2) {
        List<Integer> result = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                result.add(arr1[i]);  // common element!
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;  // move arr1 pointer
            } else {
                j++;  // move arr2 pointer
            }
        }
        return result;

        //for converion list to array
//        int[] result = new int[list.size()];
//        for (int k = 0; k < list.size(); k++) {
//            result[k] = list.get(k);
//        }
//        return result;
    }
}
