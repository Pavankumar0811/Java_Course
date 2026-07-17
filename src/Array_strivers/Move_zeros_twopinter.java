package Array_strivers;

import java.util.Arrays;

public class Move_zeros_twopinter {
    static void main(String[] args) {
        int[] nums = {0,1,2,0,5,0};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums) {
        int left = 0;   // pointer for non-zero position

        // move all non-zeros to front
        for(int right = 0; right < nums.length; right++){
            if(nums[right] != 0){
                // swap left and right
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
        }
    }
}
