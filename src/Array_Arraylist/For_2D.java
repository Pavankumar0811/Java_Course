package Array_Arraylist;

import java.util.Scanner;

public class For_2D {
   public static void main() {

       Scanner sc = new Scanner(System.in);
       //row  col
       int[][] arr = new int[5][4];

       for (int row = 0; row < 4; row++) {
           for (int col = 0; col < 4; col++) {
               arr[row][col] = sc.nextInt();
               System.out.print(arr[row][col] + "");

           }
           System.out.println();
       }

   }
}
