package Binary_search_2D;

// staircase search

import java.util.Arrays;

public class problem_1 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 3, 5},
                {2, 4, 7},
                {7, 8, 9},
                {10, 11, 12}
        };

        System.out.println(Arrays.toString(search(arr,10)));
    }

    static int[] search(int[][] arr , int target){
        int r = 0;
        int c = arr[0].length-1;

        while(r < arr.length && c >= 0){
            if(arr[r][c]==target){
                return new int[]{r,c};
            }
            else if(arr[r][c]<target){
                r++;
            }else{
                c--;
            }


        }
        return new int[]{-1,-1};
    }
}
