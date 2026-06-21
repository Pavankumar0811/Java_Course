package Leet_code_problems;

public class problem_6_insta {

    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(arr));    // se this can be different
    }


    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxnum = 0;
        int count = 0;

        for(int i = 0 ; i < nums.length ; i ++){
            if(nums[i] == 1){
                count ++;

                if(count > maxnum){
                    maxnum = count;
                }

            }else{
                count =0;
            }
        }
        return maxnum;
    }
}
