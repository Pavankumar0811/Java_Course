package Array;

public class rotate_how_many_times {
    static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int d = 3;

        main1(arr, d, n);

        for(int i =0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main1(int[] arr , int d , int n) {
        d = d % n;

        int[] temp = new int[d];
        for(int i = 0; i < d; i++){
            temp[i] = arr[i];
        }
        for(int i = d; i < n; i++){
            arr[i-d] = arr[i];
        }

        for(int i = n-d ; i < n; i++){
            arr[i] = temp[i-(n-d)];
        }

    }
}
