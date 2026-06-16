package Binary_search;

public class search4_new {
    public static void main(String[] args) {
        int[] arr = {100,90,80,70,60,50};
        int target = 20;

        int ans = seach(arr,target);
        System.out.println(ans);
    }


    static int seach(int[] arr , int target){
        boolean isAscending = arr[0]< arr[arr.length-1];


        int start =0;
        int end = arr.length-1;
        int result=-1;

        while(start<=end) {
            int mid = (start + end)/2;

            if(target == arr[mid]){
                result =mid;
                break;
            } else if (isAscending) {
               if(arr[mid]>target) {
                   end = mid-1;
               }else{
                   start = mid+1;
               }
            }else{
                if(arr[mid]>target) {
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }

        }
        return result;
    }
}
