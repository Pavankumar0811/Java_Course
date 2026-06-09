package Array_Arraylist;

import java.util.Arrays;

public class Swap_arr {
    public static void main() {
        int[] arr = {1,4,2,5,7,8};
        swap(arr, 0, 4);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr ,int index1,int index2){
      int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
