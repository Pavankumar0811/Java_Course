package Binary_search;

public class search7_mountain {
    public static void main(String[] args) {
        //int[] arr = {10,20,30,40,50,60,30,20,10,9,8,6,5,4};
        int[] arr = {1,2,1,3,5,6,4};
        int start = 0;
        int end = arr.length-1;
        int result = -1;

        while(start<=end){
            int mid = start+(end - start)/2;

            if(mid < arr.length - 1 && arr[mid] < arr[mid + 1]){
              start = mid+1;
            }else{
                end = mid-1;
            }
            result =  mid;   // or start

        }
        System.out.println(result);
    }
}
