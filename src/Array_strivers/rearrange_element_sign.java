package Array_strivers;

// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.*;

public class rearrange_element_sign {

    static void main(String[] args) {
      int[] nums = {3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(rearrangeArray(nums)));
    }

    public static int[] rearrangeArray(int[] nums) {
        List<Integer> positives = new ArrayList<>();
        List<Integer> negatives = new ArrayList<>();

        // Step 1: separate positives and negatives, preserving order
        for (int num : nums) {
            if (num > 0) {
                positives.add(num);
            } else {
                negatives.add(num);
            }
        }

        // Step 2: merge alternately - positive, negative, positive, negative...
        int[] result = new int[nums.length];
        int index = 0;
        for (int i = 0; i < positives.size(); i++) {
            result[index++] = positives.get(i);
            result[index++] = negatives.get(i);
        }

        return result;
    }
}
