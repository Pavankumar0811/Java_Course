package Leet_code_problems;

import java.util.Arrays;

public class firt_last_indexofnum {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,9,10,11};

        int target = 7;

        int[] ans = {-1,-1};

        ans[0]= search(arr,target,true);
        ans[1]= search(arr,target,false);

        System.out.println("First position: " + ans[0]);
        System.out.println("Last position: " + ans[1]);




    }

    static int search(int[] arr,int target,boolean startindex){
         int ans = -1;

         int start = 0;
         int end = arr.length-1;

         while(start<=end){

             int mid = start+(end-start)/2;

             if(target<arr[mid]){
                 end = mid-1;
             }else if(target>arr[mid]){
                 start = mid+1;
             }else{
                 ans = mid;

                 if(startindex){
                     end = mid -1;
                 }else{
                     start = mid+1;
                 }
             }
         }
         return ans;
    }
}
