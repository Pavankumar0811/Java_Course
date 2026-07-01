package Binary_search;

//no need of this question

// amazon question find infinite array

public class search10_infitearray {
    static void main(String[] args) {
     int[] arr = {3,5,7,9,10,90,100,130,130,160,170};

     int target = 10;
        System.out.println(ans(arr,target));
    }

    static int ans(int[] arr, int target) {
        int start = 0;
        int end = 1;

        while(target>arr[end]){
         int temp = end +1;    // this is new start
         end = end + (end - start +1 ) *2;
         start = temp;
        }
        return binary(arr, target, start, end);
    }

    static int binary(int[] arr,int target, int start, int end) {


        while (start <= end) {
            int mid = start + (end-start)/2;

            if(target < arr[mid]) {
                end = mid-1;
            }else if(target > arr[mid]) {
                start = mid+1;
            }else{
                return mid;
            }
        }
        return start;
    }
}

