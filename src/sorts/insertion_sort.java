package sorts;

import java.util.Arrays;

public class insertion_sort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j+ 1] = arr[j];  // shift right
                j--;
            }
            arr[j + 1] = key;  // insert at correct position
        }
    }

}
