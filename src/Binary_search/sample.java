package Binary_search;


import java.util.Arrays;

public class sample {
    public static void main(String[] args) {
        int[] piles = {3,6,7,11};
        int h = 8;

        System.out.println(search(piles, h));
    }

    public static int search(int[] piles, int h) {
       int start = 1;
       int end = 0;

       for (int i = 0; i < piles.length; i++){
           if(piles[i] > end){
               end = piles[i];
           }
       }

       int result = end;

       while(start <= end){
           int mid = start + (end - start)/2;

           int hour = 0;

           for(int i = 0; i < piles.length; i++){
               hour = hour + (piles[i] + mid -1)/mid;
           }

           if(hour <= h){
               result = mid;
               end = mid -1;
           }else{
               start = mid + 1;
           }
       }
       return result;
    }
}
