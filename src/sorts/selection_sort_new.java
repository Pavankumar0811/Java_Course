package sorts;

import java.util.Arrays;

public class selection_sort_new {

        public static void main(String[] args) {
            int[] arr = {3, 1, 5, 4, 2};
            int[] ans = selection_sort(arr);
            System.out.println(Arrays.toString(ans));
        }

        public static int[] selection_sort(int[] arr) {

            for(int i = 0 ; i < arr.length-1; i++){
                int max = i;
                for(int j = i + 1 ; j < arr.length; j++){
                    if(arr[j]  > arr[max]){    // to find min <
                        max = j;
                    }
                }
                int temp = arr[max];
                arr[max] = arr[i];
                arr[i] = temp;
            }
            return arr;
        }
    }

