package Array_strivers;

// dutch national flag algorithm

import java.util.Arrays;

public class Dutch_national_flag_012 {
    static void main(String[] args) {
        int[] arr = {0,1,2,1,1,1,0,0,2,2,0};

        System.out.println(Arrays.toString(main1(arr)));
    }

    static int[] main1(int[] arr) {
        int low = 0;
        int mid =0;
        int high = arr.length-1;

        while(mid<=high){
            if(arr[mid] == 0){
             int temp = arr[mid];
             arr[mid] = arr[low];
             arr[low] = temp;
             low++;
             mid++;
            }else if(arr[mid] == 1){
                mid++;
            }else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        return arr;
    }
}
