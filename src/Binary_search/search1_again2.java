package Binary_search;

public class search1_again2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int target = 10;
        int start = 0;
        int end = arr.length-1;
        int result = -1;

        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target){
                result = mid;
                break;
            }else if(arr[mid]>target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        System.out.println(result);


    }
}
