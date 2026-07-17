package Array_strivers;

import java.util.Arrays;

public class find_missing_duplicate {
    static void main(String[] args) {
      int[] arr = {4,3,6,2,1,1};

        System.out.println(Arrays.toString(main1(arr)));
    }

    static int[] main1(int[] arr) {


        int duplicate = -1, missing = -1;

        // find duplicate: check each value 1..n, count occurrences in arr
        for (int num = 1; num <= arr.length; num++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == num) {
                    count++;
                }
            }
            if (count == 2){
                duplicate = num;
            }
            if (count == 0){
                missing = num;
            }
        }

        return new int[] {duplicate,missing};
    }
}
