package Array_Arraylist;

import java.util.Arrays;

public class arr_2D {
    public static void main() {
        int[][] arr2D = {
            {1,2,3,4},         // memory allocation first this in one block of memory
            {1,2,3},           // second this whole in one block of memory
            {1,2,3,4}          // third this whole in another block
        };

        System.out.println(Arrays.toString(arr2D));   // we cannot print all ement in this command

        System.out.println(Arrays.deepToString(arr2D));  // this will print entire element in the array

        System.out.println(Arrays.toString(arr2D[0]));   // this will print the 0 th index in the array

        System.out.println(arr2D[0][1]);           // this will print only the 0th element 1 index elemet
    }
}
