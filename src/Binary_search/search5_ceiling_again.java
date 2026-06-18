package Binary_search;

public class search5_ceiling_again {
    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 18;

        if (target > arr[arr.length - 1]) {
            System.out.println(-1);
            return;
        }

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                System.out.println(mid);
                return;
            }
        }

        System.out.println(start); // index of ceiling element
    }
}
