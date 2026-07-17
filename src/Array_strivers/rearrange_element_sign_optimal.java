package Array_strivers;

import java.util.Arrays;

public class rearrange_element_sign_optimal {

    static void main(String[] args) {
        int[] nums = {3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(rearrangeArray(nums)));
    }

    public static int[] rearrangeArray(int[] nums) {
        int[] result = new int[nums.length];
        int posIdx = 0;   // next even index for positives
        int negIdx = 1;   // next odd index for negatives

        for (int num : nums) {
            if (num > 0) {
                result[posIdx] = num;
                posIdx += 2;
            } else {
                result[negIdx] = num;
                negIdx += 2;
            }
        }

        return result;
    }
}
