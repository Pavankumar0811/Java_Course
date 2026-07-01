package Binary_search;

public class search19_single_ele {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,4,5,5,6,6};  // this question for why we want mid%2

        System.out.println(search(nums));
    }

    public static int search(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            // make mid even always
            if (mid % 2 == 1) {
                mid--;
            }

            // if pair is intact → single element is on right
            if (nums[mid] == nums[mid + 1]) {
                start = mid + 2;
            } else {
                // pair is broken → single element is here or left
                end = mid;
            }
        }
        return nums[start];
    }
}
