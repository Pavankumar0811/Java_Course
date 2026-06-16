package Binary_search;

public class Search2_asc {
    public static void main(String[] args) {

        int[] arr = {-1,10, 20, 50, 100, 500, 1000, 1500};
        int target = 100;


        int start = 0;
        int end = arr.length - 1;
        int result = -1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                result = mid;
                break;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        if (result != -1) {
            System.out.println("Target " + target + " found at index: " + result);
        } else {
            System.out.println("Target not found");
        }
    }
}
