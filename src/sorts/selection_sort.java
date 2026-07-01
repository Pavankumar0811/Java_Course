package sorts;

import java.util.Arrays;

public class selection_sort {
    public static void main(String[] args) {
//        int[] arr = {3, 1, 5, 4, 2};
        int[] arr = {5,4,2,1,3};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        //int arr.length = arr.length;
        for (int i = 0; i < arr.length -1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            // swap
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
}
