package sorts;

// move all zeros

import java.util.Arrays;

public class bubble_sort_leetcode {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        int j = 0; // points to current zero position

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                // swap zero and non-zero
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
        }
        // to shift the zeros to left

//        for (int i = arr.length-1; i >=0 ; i--) {
//            if (arr[i] != 0) {
//                // swap zero and non-zero
//                int temp = arr[j];
//                arr[j] = arr[i];
//                arr[i] = temp;
//                j--;
//            }
//        }

        System.out.println(Arrays.toString(arr));
    }

}
