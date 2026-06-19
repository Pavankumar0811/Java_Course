package Binary_search;

public class search12_hardmountain {
    public static void main(String[] args) {

    }

    int search2(int[] arr , int target){
        int peak = peankIndexInMountainArray(arr);
     int firsttry = orderAignosticsearch(arr,target,0,peak);
     if(firsttry!= -1){
         return firsttry;
     }
     return orderAignosticsearch(arr,target,peak+1,arr.length-1);
    }

    static int peankIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return start;
    }

    static int orderAignosticsearch(int[] arr, int target,int start,int end) {


     boolean isAsc = arr[start]<arr[end];

     int mid = start + (end-start)/2;

     while(start<=end) {

         if (arr[mid] == target) {
             return mid;
         }


         if (isAsc) {
             if (target < arr[mid]) {
                 end = mid - 1;
             } else {
                 start = mid + 1;
             }
         } else {
             if (target > arr[mid]) {
                 end = mid - 1;
             } else {
                 start = mid + 1;
             }
         }
     }
        return -1;
     }



}
