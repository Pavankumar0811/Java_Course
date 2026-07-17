package Array_strivers;

// leetcode 1752

public class checking_sorted {
    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};

        System.out.println(main1(nums));
    }

    public static boolean main1(int[] nums) {
        int count = 0;

        for(int i=1;i<nums.length;i++) {

            if (nums[i-1] > nums[i] ) {
                count++;
            }
        }
        if(nums[nums.length-1] > nums[0]){
            count++;
        }

        return count <=1;
    }
}
