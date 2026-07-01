package Binary_search;

public class search15_rotatedarray3 {
    public static void main(String[] args) {
        //int[] nums = {11,13,15,17};
        //int[] nums = {4,5,6,7,0,1,2};
        int[] nums = {3,4,5,1,2};
        //int[] nums = {1,2,3,4,5};
        System.out.println(search(nums));
    }

    public static int search(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Already sorted — minimum is at start
            if (nums[start] <= nums[end]) {
                return nums[start];
            }

            // Minimum is next element
            if (nums[mid] > nums[mid + 1]) {
                return nums[mid + 1];
            }

            // Minimum is current element
            if (nums[mid] < nums[mid - 1]) {
                return nums[mid];
            }

            // Left half is sorted → go right
            if (nums[mid] > nums[start]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
