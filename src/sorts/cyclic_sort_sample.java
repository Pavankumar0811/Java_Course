package sorts;

import java.util.Arrays;

public class cyclic_sort_sample {
    public static void main(String[] args) {
        int[] arr = {4,2,3,1};
        int i = 0;
        System.out.println(main1(arr,i));
    }

    public static int main1(int[] arr , int i) {
        while(i < arr.length){
            int crt = arr[i]-1;
            if(arr[i] < arr.length && arr[i] != arr[crt]){
                int temp = arr[crt];
                arr[crt] = arr[i];
                arr[i] = temp;
            }else{
                i ++;
            }
        }
        for(int j = 0; j < arr.length; j++){
            System.out.print(arr[j] + " ");
        }
        return arr.length +1;
    }
}
