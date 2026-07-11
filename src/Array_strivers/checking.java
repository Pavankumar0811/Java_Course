package Array_strivers;

// leetcode 1752

public class checking {
    static void main(String[] args) {
        //int[] nums = {1,2,3,4,5};
        int[] nums = {3,4,5,1,2};

        System.out.println(main1(nums));
    }

    static boolean main1(int[] nums) {
        int n = nums.length-1;
        int count = 0;

        for(int i = 0; i < n; i++){
            if(nums[i] > nums[i+1]){
                count++;
            }
            if(count > 1){
                return false;  // more than 1 drop → false
            }
        }

        // check last vs first
        if(nums[n] > nums[0]){
            count++;
        }

        if(count > 1){
            return false;
        }

        return true;
    }
}
