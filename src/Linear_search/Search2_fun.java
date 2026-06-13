package Linear_search;

import java.util.Scanner;

public class Search2_fun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number of elements in the array");
        int x = input.nextInt();
        int[] arr = {1,23,12,34,11,12};
        int z = linearsearch(arr,x);
        System.out.println(z);
    }

    static int linearsearch(int[] arr, int x) {

        int num = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
               int ans = i;
                return ans;
            }

        }

        return -1;

    }
}
