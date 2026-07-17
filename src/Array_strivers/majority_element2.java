package Array_strivers;

//if they say n/3 times element use this algorithm

import java.util.*;

public class majority_element2 {
    static void main(String[] args) {
          //int[] nums = {3, 2, 3};
          int[] nums = {2,1,2,1,2,1,2};
        //int[] nums = {1,2,3,4,5,6};    // this condition it will return only emtry array thus we need verification

        System.out.println(majorityElement(nums));
    }

    public static List<Integer> majorityElement(int[] nums) {
        // Step 1: find 2 candidates
        int candidate1 = 0, count1 = 0;
        int candidate2 = 0, count2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == candidate1) {
                count1++;
            } else if (nums[i] == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = nums[i];
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = nums[i];
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        // Step 2: verify candidates
        count1 = 0;
        count2 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == candidate1){
                count1++;
            }
            else if (nums[i] == candidate2){
                count2++;
            }
        }

        // Step 3: add to result if > n/3
        List<Integer> result = new ArrayList<>();
        if (count1 > nums.length / 3){
            result.add(candidate1);
        }
        if (count2 > nums.length / 3){
            result.add(candidate2);
        }

        return result;
    }
}
