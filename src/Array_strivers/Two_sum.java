package Array_strivers;

import java.util.Arrays;
import java.util.HashMap;

public class Two_sum {
    static void main(String[] args) {
     int[] nums = {1,2,1,2,1,2,5};
     int target = 6;
        System.out.println(Arrays.toString(main1(nums,target)));
    }

    static int[] main1(int[] nums , int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];

            // check if complement already exists in map
            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }

            // store current number and index
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}
