package Array_strivers;

public class rotate_how_many_times_2 {
    static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int n = arr.length;
        int d = 3;

        rotateLeft(arr, d, n);

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void rotateLeft(int[] arr, int d, int n) {
        d = d % n;

        // Step 1: reverse first d elements
        reverse(arr, 0, d-1);

        // Step 2: reverse remaining elements
        reverse(arr, d, n-1);

        // Step 3: reverse entire array
        reverse(arr, 0, n-1);
    }

    static void reverse(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
