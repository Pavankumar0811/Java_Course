package Recursion;

public class recursion12 {
    static void main(String[] args) {
        String str = "lol";
        char[] arr = str.toCharArray();
        System.out.println(isPalindrome(arr, 0, arr.length - 1));
    }

    static boolean isPalindrome(char[] arr, int i, int j) {
        if (i >= j) {
            return true; // base case: pointers met/crossed, no mismatch found
        }

        if (arr[i] != arr[j]) {
            return false; // mismatch found, not a palindrome
        }

        return isPalindrome(arr, i + 1, j - 1); // check the next inner pair
    }
}
