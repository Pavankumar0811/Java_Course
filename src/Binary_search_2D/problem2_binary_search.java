package Binary_search_2D;

import java.util.Arrays;

public class problem2_binary_search {
    public static void main(String[] args) {
        int[][] arr = {
                {1,  2,  3,  4},
                {5,  6,  7, 8},
                {9,  10, 11, 12},
                {13, 14, 15, 16}
        };

        int target = 11;
        System.out.println(Arrays.toString(search(arr, target)));
    }

    static int[] search(int[][] arr, int target) {
        int rows = arr.length;      // 4
        int cols = arr[0].length;   // 4

        int start = 0;
        int end = rows * cols - 1;  // 15 (treat as 1D array of 16 elements)

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Convert mid → 2D index
            int row = mid / cols;
            int col = mid % cols;

            if (arr[row][col] == target) {
                return new int[]{row, col};
            } else if (arr[row][col] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }
}
