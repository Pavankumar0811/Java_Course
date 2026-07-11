package Recursion;

import java.util.Arrays;

public class recursion5 {
    static void main(String[] args) {
        int[] arr = {3,2,1,4,5};
        int i =0;
        int j =arr.length-1;

        main1(arr,i,j);
    }

    static void main1(int[] arr,int i,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        if(i >= j){
            System.out.println(Arrays.toString(arr));
            return;
        }

        main1(arr,i+1,j-1);
    }
}
