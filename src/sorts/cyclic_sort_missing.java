package sorts;

// finding the missing number using cyclic sort

public class cyclic_sort_missing {
    static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(sort(nums));
    }
    static int sort(int[] nums) {
        int i = 0;

        // Step 1: Cyclic sort
        while (i < nums.length) {
            int correct = nums[i]; // correct index for nums[i]
            if (nums[i] < nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        // Step 2: Find missing number
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j) {
                return j;
            }
        }

        return nums.length;
    }

    static void swap(int[] nums , int i, int correct) {
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
    }
}
