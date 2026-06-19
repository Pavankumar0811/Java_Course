package Binary_search;

public class search4 {

        // Function 1 : check ascending or descending
        public static boolean isAscending(int[] nums) {
            return nums[0] < nums[nums.length - 1];
        }

        // Function 2 : binary search
        public static int binarySearch(int[] nums, int target, boolean ascending) {

            int left = 0;
            int right = nums.length - 1;
            int result = -1;

            while (left <= right) {

                int mid = (left + right) / 2;

                if (nums[mid] == target) {
                    result = mid;
                    break;

                } else if (ascending) {

                    // Ascending logic
                    if (nums[mid] < target) {
                        left = mid + 1;   // go right
                    } else {
                        right = mid - 1;  // go left
                    }

                } else {

                    // Descending logic
                    if (nums[mid] > target) {
                        left = mid + 1;   // go right
                    } else {
                        right = mid - 1;  // go left
                    }
                }
            }

            return result;
        }

        // Function 3 : main
        public static void main(String[] args) {

            int[] bin = {10, 20, 50, 100, 500, 1000, 1500};
            int target = 100;

            // Step 1 : check order
            boolean ascending = isAscending(bin);

            if (ascending) {
                System.out.println("Array is sorted in Ascending order");
            } else {
                System.out.println("Array is sorted in Descending order");
            }

            // Step 2 : perform binary search
            int result = binarySearch(bin, target, ascending);

            // Step 3 : print result
            if (result != -1) {
                System.out.println("Target " + target + " found at index: " + result);
            } else {
                System.out.println("Target " + target + " not found");
            }
        }
    }

