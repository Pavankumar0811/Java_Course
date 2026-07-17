package Array_strivers;

import java.util.*;

public class single_num_hashmap {
    static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
        System.out.println(main1(arr));
    }

    static int main1(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.getOrDefault(arr[i], 0) + 1);
            }else{
                map.put(arr[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()<=1){
                return entry.getKey();
            }

        }
        return -1;
    }
}
