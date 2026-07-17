package Array_strivers;

import java.util.*;

public class cheching_sort_bruteforce {
    static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        Arrays.sort(arr);
        System.out.println(main1(arr));
    }

    static boolean main1(int[] arr) {
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < arr[i-1]){
             return false;
            }
        }
        return true;
    }
}
