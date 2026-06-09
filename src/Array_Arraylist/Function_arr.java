package Array_Arraylist;

import java.util.Arrays;

public class Function_arr {
    public static void main() {
        int arr[] = {1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] arr){
        arr[0] = 99;
    }


}
