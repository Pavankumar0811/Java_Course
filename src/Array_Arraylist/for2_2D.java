package Array_Arraylist;

public class for2_2D {
   public static void main() {
       int[][] arr = {
               {1,2,3,4},
               {1,2,3},
               {1,2,3,4}
       };

       for(int row=0; row< arr.length;row++){
           for(int col= 0; col< arr[row].length;col++){
               System.out.print(arr[row][col]+" ");
           }
           System.out.println();
       }
    }
}
