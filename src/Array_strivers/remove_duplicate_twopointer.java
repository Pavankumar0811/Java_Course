package Array_strivers;

// O(n) O(1)

public class remove_duplicate_twopointer {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        int k = removeDuplicates(nums);

        for(int i = 0; i < k; i++){
            System.out.print(nums[i] + " ");
        }
    }

    public static int removeDuplicates(int[] nums) {
        int left = 0;   // slow pointer
        int right = 1;  // fast pointer

        while(right < nums.length){
            if(nums[right] != nums[left]){
                left++;                    // move left forward
                nums[left] = nums[right];  // place unique element
            }
            right++;  // always move right
        }
        return left + 1;  // count of unique elements
    }
}
