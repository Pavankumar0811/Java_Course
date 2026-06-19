package Binary_search;

public class Search3 {
    public static void main(String[] args) {

        int[] arr = {10, 20, 50, 100, 500, 1000, 1500};
        int target = 100;

        int start = 0;
        int end = arr.length - 1;
        int result = -1;

        // Step 1: Check if array is ascending or descending
        boolean isAscending = arr[0] < arr[arr.length - 1];

        while (start <= end) {

            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                System.out.println(mid);
                return;

            } else if (isAscending) {

                // Ascending order logic
                if (arr[mid] < target) {
                    start = mid + 1;   // go end
                } else {
                    end = mid - 1;  // go start
                }

            } else {

                // Descending order logic
                if (arr[mid] > target) {
                    start = mid + 1;   // go end
                } else {
                    end = mid - 1;  // go start
                }
            }
        }

        if (isAscending) {
            System.out.println("Array is sorted in Ascending order");
        } else {
            System.out.println("Array is sorted in Descending order");
        }

        if (result != -1) {
            System.out.println("Target " + target + " found at index: " + result);
        } else {
            System.out.println("Target " + target + " not found");
        }
    }
}
