package Recursion;

import java.util.Arrays;

public class recursion6 {
    static void main(String[] args) {
        String str = "hello";
        char[] arr = str.toCharArray();
        reverse(arr, 0, arr.length - 1);
        //System.out.println(new String(arr));    here or there anywhere can be printed
    }

    static void reverse(char[] arr, int i, int j) {
        if (i >= j) { // fixed: >= instead of ==, handles both odd & even lengths
            System.out.println(new String(arr));
            return;
        }

        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        reverse(arr, i + 1, j - 1);
    }
}
