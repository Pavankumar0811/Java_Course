package sorts;

import java.util.ArrayList;
import java.util.List;

public class cyclic_sort3 {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(search(arr));
    }

    public static List<Integer> search(int[] arr) {
     int i = 0;
     while(i < arr.length){
         int correct = arr[i] -1;
         if(arr[i] != arr[correct]){
             int temp = arr[correct];
             arr[correct] = arr[i];
             arr[i] = temp;
         }else{
             i ++;
         }
     }
     ArrayList<Integer> list = new ArrayList<Integer>();
     for(int j = 0; j < arr.length;j++){
         if(arr[j] != j+1){
             list.add(j+1);
         }

     }
     return list;
    }


}
