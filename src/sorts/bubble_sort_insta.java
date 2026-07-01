package sorts;

import java.util.Arrays;

public class bubble_sort_insta {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        int first = arr[0];
        int last = arr[arr.length-1];

        int temp = arr[arr.length-1];
        arr[arr.length-1] = first;
        arr[0] = last;


        System.out.println(Arrays.toString(arr));



    }
}
