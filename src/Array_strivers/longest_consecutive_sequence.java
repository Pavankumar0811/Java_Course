package Array_strivers;
//(O(n log n)
import java.util.Arrays;

public class longest_consecutive_sequence {
    static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        System.out.println(main1(nums));
    }

    static int main1(int[] nums) {
        if (nums.length == 0) return 0;

        Arrays.sort(nums);

        int longest = 1;
        int current = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]) {
                continue; // skip duplicates
            } else if (nums[i] == nums[i-1] + 1) {
                current++;
            } else {
                current = 1; // reset streak
            }
            longest = Math.max(longest, current);
        }

        return longest;
    }
}
