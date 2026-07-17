package Array_strivers;
import java.util.*;

public class rearrange_element_sign_2 {
    static void main(String[] args) {
         //int[] nums = {-1,2,3,4,-3,1};
        int[] nums = {1,2,-4,-5,3,6};


        System.out.println(Arrays.toString(rearrangeArray(nums)));
    }

    public static int[] rearrangeArray(int[] nums) {
        List<Integer> positives = new ArrayList<>();
        List<Integer> negatives = new ArrayList<>();

        // Step 1: separate positives and negatives
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                positives.add(nums[i]);
            }else{
                negatives.add(nums[i]);
            }
        }

        // Step 2: merge alternately
        int[] result = new int[nums.length];
        int index = 0;

        // find smaller size
        int minSize = Math.min(positives.size(), negatives.size());

        // alternate till smaller list exhausts
        for(int i = 0; i < minSize; i++){
            result[index++] = positives.get(i);
            result[index++] = negatives.get(i);
        }

        // add remaining positives
        for(int i = minSize; i < positives.size(); i++){
            result[index++] = positives.get(i);
        }

        // add remaining negatives
        for(int i = minSize; i < negatives.size(); i++){
            result[index++] = negatives.get(i);
        }

        return result;
    }
}
