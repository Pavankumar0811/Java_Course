package sorts;

import java.util.Arrays;

public class sample {
    public static void main(String[] args) {
        int[] arr = {5,3,1,2,4,0};

        System.out.println(Arrays.toString(bubble(arr)));

    }

    public static int[] bubble(int[] arr) {
        int i = 0;

        while(i < arr.length){
            int correct = arr[i];
            if(arr[i] != arr[correct]){
                int temp = arr[correct];
                arr[correct] = arr[i];
                arr[i] = temp;
            }else{
                i ++;
            }
        }
        return arr;
    }
}
