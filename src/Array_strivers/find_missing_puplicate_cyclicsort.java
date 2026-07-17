package Array_strivers;

import java.util.Arrays;

public class find_missing_puplicate_cyclicsort {
        static void main(String[] args) {
            int[] arr = {4, 3, 6, 2, 1, 1};
            System.out.println(Arrays.toString(main1(arr)));
        }

        static int[] main1(int[] arr) {
            int n = arr.length;
            int i = 0;

            // Step 1: cyclic sort - place each number at its correct index
            while (i < n) {
                int correctIndex = arr[i] - 1;
                if (arr[i] != arr[correctIndex]) {
                    // swap arr[i] to its correct position
                    int temp = arr[i];
                    arr[i] = arr[correctIndex];
                    arr[correctIndex] = temp;
                } else {
                    i++;
                }
            }

            // Step 2: find the index where arr[i] != i+1
            for (i = 0; i < n; i++) {
                if (arr[i] != i + 1) {
                    // arr[i] is the duplicate, i+1 is the missing number
                    return new int[]{arr[i], i + 1}; // {duplicate, missing}
                }
            }

            return new int[]{-1, -1}; // no duplicate/missing found
        }
    }
