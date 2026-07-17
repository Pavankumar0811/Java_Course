package Array_strivers;

// O(n) and O(1)

public class remove_duplicate {
    static void main(String[] args) {
       int[] nums = {0,0,1,1,1,2,2,3,3,4};

        int k = array(nums);  // ✅ call method first!

        // print only unique elements
        for(int i = 0; i < k; i++){
            System.out.print(nums[i] + " ");
        }
    }

    static int array(int[] nums) {
        int j = 1;  // when it not contains 0 then 0 if it contains 0 then 1

        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i-1]){  // new unique element found
                nums[j] = nums[i];     // place at j
                j++;
            }
        }
        return j;
    }
}
