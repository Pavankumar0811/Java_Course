package sorts;

import java.util.Arrays;

public class sample {
    public static void main(String[] args) {
        int[] arr = {5,0,0,1,4};
        System.out.println(bubble(arr));
    }

    public static String bubble(int[] arr) {
        for(int i = 0; i < arr.length-1; i++){
            int minIdx = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[minIdx]){
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }


       return Arrays.toString(arr);
    }
}
