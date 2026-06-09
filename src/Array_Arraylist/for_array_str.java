package Array_Arraylist;

import java.util.Arrays;
import java.util.Scanner;

public class for_array_str {
    static void main() {

        Scanner sc = new Scanner(System.in);

        String[] arr = new String[5];

        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.next();            // we should have to use next()

        }
        arr[0] = "pavan";            // array of 0th index is changed to pavan
        System.out.println(Arrays.toString(arr));
    }
}
