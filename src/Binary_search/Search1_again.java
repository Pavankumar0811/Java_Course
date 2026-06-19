package Binary_search;

public class Search1_again {
    public static void main(String[] args) {
        int[] arr = {10,9,7,6,5,4,3,2,1};

        int target = 500;
        int start = 0;
        int end = arr.length-1;
        int result = -1;

        while(start<=end){
            int mid = (start + end )/2;
            if(arr[mid]==target){
                System.out.println(mid);
                return;
            }
            else if(arr[mid]>target){
                start = mid+1;
            }else{
                end = mid -1;
            }
        }
        if(result!=-1){
            System.out.println("found at index " + result);
        }else {
            System.out.println("not found");
        }
    }
}
