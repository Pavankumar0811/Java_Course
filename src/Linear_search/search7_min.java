package Linear_search;

import java.util.Scanner;

public class search7_min {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         int[] arr = {1 , 2 , 3 , 10 , 20, 30};
         int min = 0;

         for(int i = 0 ; i < arr.length ; i++){
             min = arr[0];
             if(arr[i]<min){
                 min = arr[i];
             }
         }
       System.out.print("the minimum in array: " + min);
    }
}
