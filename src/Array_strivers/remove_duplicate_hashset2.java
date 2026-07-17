package Array_strivers;

import java.util.*;

public class remove_duplicate_hashset2 {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        System.out.println(main1(nums));


    }

    public static HashSet<Integer> main1(int[] nums) {
        HashSet<Integer> map = new HashSet<> ();
        for (int i = 0; i < nums.length; i++) {
            map.add(nums[i]);
        }

        return map;
    }
}
