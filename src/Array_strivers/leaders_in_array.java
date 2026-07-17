package Array_strivers;

import java.util.ArrayList;
import java.util.List;

public class leaders_in_array {
    static void main(String[] args) {
        int[] arr = {10,22,12,3,0,6};
        System.out.println(main1(arr));
    }

    static List<Integer> main1(int[] arr) {
        List<Integer> list = new ArrayList();

        for(int i = 0; i < arr.length; i++){
               boolean greatest = true;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] < arr[j]){
                    greatest = false;
                    break;
                }
            }
            if(greatest){
                list.add(arr[i]);
            }

        }
        return list;
    }
}
