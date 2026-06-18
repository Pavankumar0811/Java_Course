package Leet_code_problems;

public class problem_4_samemount {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,5,6,4};

        System.out.println(findPeakElement(nums));
    }

    static int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        int result = -1;

        while(start<=end){
            int mid = start+(end - start)/2;

            if(mid < nums.length - 1 && nums[mid] < nums[mid + 1]){
                start = mid+1;
            }else{
                result = mid;
                end = mid-1;
            }
        }
        return result;
    }
}
