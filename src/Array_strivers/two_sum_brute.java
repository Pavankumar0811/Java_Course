package Array_strivers;

import java.util.*;

public class two_sum_brute {
    static void main(String[] args) {
        int[] nums = {6,6,9,10};
        int target = 12;

        //Arrays.stream(nums).sorted();   // to sort the answer

        System.out.println(Arrays.toString(main1(nums, target)));
    }

    static int[] main1(int[] nums, int target) {

        for(int i = 0; i < nums.length;i++){
            for(int j = 1; j < nums.length;j++){
                    if(nums[i] + nums[j] == target){
                        return new int[]{i,j};
                    }
            }
        }
       return new int[]{-1,-1};
    }
}
