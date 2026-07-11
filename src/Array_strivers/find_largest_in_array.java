package Array_strivers;

public class find_largest_in_array {
    static void main(String[] args) {
        int [] arr = {5,5,4,1,2,3};
        //int [] arr = {5,5,5,5,5};
        System.out.println(arr(arr));
    }

    static int arr(int[] arr) {
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > min){
                min = arr[i];
            }
        }

        int secondLargest = -1;     // if it contains - numbers use minimum intergr as second largest
        for(int j = 0; j < arr.length; j++){
            if(arr[j] > secondLargest && arr[j] < min){  // ✅
                secondLargest = arr[j];
            }

        }
        if(secondLargest == -1){
            return -1;  // no 2nd largest exists
        }
        return secondLargest;
    }
}
