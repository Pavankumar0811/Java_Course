package Binary_search;

// find the first and second largest in the array

public class Find_first_largest {
    static void main(String[] args) {
        int[] arr = {4,5,1,2,3};
        System.out.println(main1(arr));
    }

    static int main1(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        if (arr[end]>=arr[start]) {
            return arr[end];       // end -1 to find second largest 1 to find first largest
        }

        while(start<end){
            int mid = start + (end - start)/2;

            if(arr[mid] > arr[end]){
                start = mid + 1;  // min is in right half
            }else{
                end = mid;        // min is here or left
            }
        }
        return arr[(start - 1 + arr.length) % arr.length];    // -2 to find second largest and -1 for 1st largest
    }
}
