package Leet_code_problems;

public class sort_colors {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
      colors(nums);

        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }

    public static void colors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                // swap with low region
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                // 1 is in correct place
                mid++;
            } else {
                // swap with high region
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
                // don't increment mid — recheck swapped element
            }
        }
    }
}
