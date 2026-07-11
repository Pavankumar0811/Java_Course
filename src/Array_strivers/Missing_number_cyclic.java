package Array_strivers;

public class Missing_number_cyclic {
    static void main(String[] args) {
        int[] arr1 = {0,1,2,4,5};
        System.out.println(main1(arr1));
    }

    public static int main1(int[] nums) {
        int i = 0;

        // Step 1: Cyclic sort
        while (i < nums.length) {
            int correct = nums[i]; // correct index for nums[i]
            if (nums[i] < nums.length && nums[i] != nums[correct]) {
                // swap
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
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
}
