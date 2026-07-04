package Binary_search;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sample {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(search(arr));
    }

    public static List<Integer> search(int[] arr) {
       int i = 0;

       while(i < arr.length){
           int crt = arr[i]-1;
           if(arr[i] != arr[crt]){
               int temp = arr[crt];
               arr[crt] = arr[i];
               arr[i] = temp;
           }else{
               i ++;
           }
       }
        List<Integer> list = new ArrayList<Integer>();
       for(int j=0;j<arr.length;j++){
           if(arr[j] != j + 1){
               list.add(j + 1);
           }
       }
       return list;
    }


}
