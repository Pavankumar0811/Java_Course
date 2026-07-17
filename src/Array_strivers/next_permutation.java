package Array_strivers;

// next permutation brute force - recursion

import java.util.Arrays;

public class next_permutation {
    static void main(String[] args) {
        int[] nums = {1,3,2};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int breakPoint = -1;

        // Step 1: find break point from right
        // where nums[i] < nums[i+1]
        for(int i = n-2; i > breakPoint; i--){
            if(nums[i] < nums[i+1]){
                breakPoint = i;
                break;
            }
        }

        // Step 2: if break point found
        // find next greater element and swap
        if(breakPoint != -1){
            for(int i = n-1; i > breakPoint; i--){
                if(nums[i] > nums[breakPoint]){
                    int temp = nums[i];
                    nums[i] = nums[breakPoint];
                    nums[breakPoint] = temp;
                    break;
                }
            }
        }

        // Step 3: reverse from breakPoint+1 to end
        int left = breakPoint + 1;
        int right = n - 1;
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
