package Array_strivers;

// method prefixsum

import java.util.HashMap;

public class subarray_optimal {
    static void main(String[] args) {
        int[] nums = {3, 4, 7, 2, -3, 1, 4, 2};
        int k =7;

        System.out.println(main12(nums, k));
    }

    static int main12(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);  // empty subarray has sum 0

        int count = 0;
        int prefixSum = 0;

        for(int i = 0; i < nums.length; i++){
            prefixSum = prefixSum + nums[i];

            // check if (prefixSum - k) exists in map
            if(map.containsKey(prefixSum - k)){
                count = count + map.get(prefixSum - k);
            }

            // add current prefixSum to map
            if(map.containsKey(prefixSum)){
                map.put(prefixSum, map.get(prefixSum) + 1);  // ✅ split!
            }else{
                map.put(prefixSum, 1);  // ✅ split!
            }
        }
        return count;
    }
}
