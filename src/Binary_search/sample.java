package Binary_search;


import java.util.Arrays;

public class sample {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(search(arr));
    }

    public static int search(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;

            if (arr[mid] > arr[end]) {
                start = mid + 1;      // min is in right half
            } else if (arr[mid] < arr[end]) {
                end = mid;            // min is at mid or left half
            } else {
                end--;                // duplicate — shrink right only
            }
        }
        return arr[start];
    }
}
