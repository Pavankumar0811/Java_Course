package Recursion;

// recursion binary search

public class recursion4 {
    static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 9;

        System.out.println(recursion(arr,target,0,arr.length-1));
    }

    public static int recursion(int[] arr,int target , int start, int end) {
        if(target > arr[end]){
           return -1;
        }

        int mid = start + (end - start)/2;

        if(arr[mid] == target){
            return mid;
        }
        if(arr[mid] > target){
            return recursion(arr,target,start,mid-1);
        }

        return recursion(arr,target,mid+1,end);
    }
}
