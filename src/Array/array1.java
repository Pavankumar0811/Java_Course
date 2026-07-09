package Array;
// two sum
import java.util.Arrays;
import java.util.HashMap;

public class array1 {
    static void main(String[] args) {
        int[] arr = {5,6,11,12};
        int target = 23;

        System.out.println(Arrays.toString(array(arr,target)));
    }

    static int[] array(int[] arr,int target) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0 ; i < arr.length ; i++){
            int compliment = target - arr[i];
            if(map.containsKey(compliment)){
                return new int[]{map.get(compliment) , i};
            }else{
                map.put(arr[i],i);
            }
        }
        return new int[] {-1,-1};
    }
}
