package Array_Arraylist;

import java.util.Arrays;
import java.util.Scanner;

public class for_array {
    static void main() {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);


        for (int i = 0 ; i <arr.length ; i++){
            arr[i] = sc.nextInt();
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print(Arrays.toString(arr));

    }

}
