package Binary_search;

// leetcode 81

public class search16_rotatedarray4 {
    static void main(String[] args) {
        //int[] nums = {2,5,6,0,0,1,2};
        int[] nums = {1, 1, 1, 3, 1};
        //int target = 0;
        int target = 3;
        System.out.println(search(nums,target));
    }

    static boolean search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Found target
            if (nums[mid] == target) {
                return true;
            }

            // ⭐ Key extra step for duplicates
            // Can't decide which half is sorted → shrink both ends
            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                start++;
                end--;
            }

            // Left half is sorted
            else if (nums[start] <= nums[mid]) {
                if (target >= nums[start] && target < nums[mid]) {
                    end = mid - 1;   // target is in left half
                } else {
                    start = mid + 1; // target is in right half
                }
            }

            // Right half is sorted
            else {
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1; // target is in right half
                } else {
                    end = mid - 1;   // target is in left half
                }
            }
        }
        return false;
    }
}
