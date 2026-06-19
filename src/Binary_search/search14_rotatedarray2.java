package Binary_search;

public class search14_rotatedarray2 {
    public static void main(String[] args) {
        //int[] arr = { 6, 7,8, 0, 1, 2,4,5};
        //int[] arr = {3,4,5,6,7,8,9,1,2};
        int[] arr = {7,8,9,1,2,3,4,5,6};
        System.out.println(findRotationCount(arr));  // Output: 4
    }

    static int findRotationCount(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        // Already sorted, no rotation
        if (arr[start] <= arr[end]){
            return 0;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // If mid is greater than next element → next element is the minimum
            if (arr[mid] > arr[mid + 1]){
                return mid + 1;
            }

            // If mid is less than previous element → mid itself is the minimum
            if (arr[mid] < arr[mid - 1]){
                return mid;
            }

            // Left half is sorted → rotation is in right half
            if (arr[mid] > arr[start]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return 0;
    }
}
