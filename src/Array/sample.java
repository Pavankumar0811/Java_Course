package Array;

import java.util.*;

public class sample {
    public static void main(String[] args) {
        int [] arr1 = {5,5,4,1,2,3};
        int [] arr2 = {5,5,4,1,5,2};

        System.out.println(main1(arr1,arr2));
    }

    public static List<Integer> main1(int[] arr1, int[] arr2) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        int j =0;

        while(i < arr1.length && j < arr2.length ){
            if(arr1[i] == arr2[j]){
                list.add(arr1[i]);
                i++;
                j++;
            }else if(arr1[i] < arr2[j]){
                i++;
            }else{
                j++;
            }
        }
        return list;
    }
}
