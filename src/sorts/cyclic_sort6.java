package sorts;

public class cyclic_sort6 {
    public static void main(String[] args) {
        int[] arr = {3,4,-1,1};

        System.out.println(search(arr));
    }

    public static int search(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int crt = arr[i]-1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[crt]) {
                int temp = arr[i];
                arr[i] = arr[crt];
                arr[crt] = temp;
            } else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j+1) {
                return j+1;
            }
        }
        return arr.length+1;
    }
}
