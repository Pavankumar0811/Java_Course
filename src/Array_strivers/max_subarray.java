package Array_strivers;

public class max_subarray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            int currentSum = 0;
            for(int j = i; j < nums.length; j++){
                currentSum = currentSum + nums[j];  // add element to current subarray
                if(currentSum > maxSum){
                    maxSum = currentSum;  // update max
                }
            }
        }
        return maxSum;
    }
}
