package Binary_search;

public class search5_ceiling_again {
    public static void main(String[] args) {

        int[] arr = {5, 6, 7, 8, 9, 10};
        int target = 8;

        System.out.println(ceiling(arr, target));

        }

    static int ceiling (int[] arr , int target) {
        if (target > arr[arr.length - 1]) {

            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid + 1;    // we do this to find ceiling and floor
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }


}

