package Binary_search;

public class search17_hard_sameas16 {
    public static void main(String[] args) {
        //int[] nums = {2,2,2,0,1};
        //int[] nums = {1,3,5};
        int[] nums = {1, 1, 1, 1, 1};    // its for hard rotated array
        System.out.println(search(nums));
    }

    public static int search(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[end]) {
                start = mid + 1;      // min is in right half
            } else if (nums[mid] < nums[end]) {
                end = mid;            // min is at mid or left half
            } else {
                end--;                // duplicate — shrink right only
            }
        }
        return nums[start];
    }
}
