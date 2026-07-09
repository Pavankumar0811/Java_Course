package Array;

import java.util.Arrays;

public class rotate_array_onetime {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(main1(arr)));
    }

    public static int[] main1(int[] arr) {
        int temp = arr[0];

        for(int i =1 ; i < arr.length; i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;

        return arr;
    }
}
