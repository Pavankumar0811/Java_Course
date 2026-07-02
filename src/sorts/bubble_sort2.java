package sorts;

import java.util.Arrays;

public class bubble_sort2 {
    public static void main(String[] args) {
        int[] arr = {3,1,5,4,2};

        System.out.println(Arrays.toString(bubble(arr)));
    }

    public static int[] bubble(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j =0; j< arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
