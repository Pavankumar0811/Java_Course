package Array_strivers;

import java.util.Arrays;

public class Move_zeros {
    public static void main(String[] args) {
      int[] nums = {1,3,12,0,0};
        main2(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void main2(int[] nums) {
        int j = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[j] = nums[i];
                j++;
            }
        }

        while(j < nums.length){
            nums[j] = 0;
            j++;
        }
    }
}
