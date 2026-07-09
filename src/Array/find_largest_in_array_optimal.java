package Array;

public class find_largest_in_array_optimal {
    static void main(String[] args) {
     int[] arr = {5,3,2,10,11};
        System.out.println(main1(arr));
    }

    static int main1(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                secondLargest = largest;  // old largest becomes 2nd
                largest = arr[i];         // update largest
            }else if(arr[i] > secondLargest && arr[i] < largest){
                secondLargest = arr[i];   // update 2nd largest
            }
        }
        return secondLargest;
    }
}
