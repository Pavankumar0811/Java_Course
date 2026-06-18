package Binary_search;

public class search7_mountain {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,3,2,1};
        int start = 0;
        int end = arr.length-1;
        int result = -1;

        while(start<=end){
            int mid = start+(end - start)/2;

            if(mid < arr.length - 1 && arr[mid] < arr[mid + 1]){
              start = mid+1;
            }else{
                result = mid;
                end = mid-1;
            }
        }
        System.out.println(result);
    }
}
