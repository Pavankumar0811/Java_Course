package Binary_search;

public class sample3 {
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};


        System.out.println(search(nums));
    }

    public static int search(int[] nums) {

       int i = 0;

       while(i < nums.length){
           int crt = nums[i];
           if(nums[i] < nums.length && nums[i] != nums[crt]){
               swap10(nums,i,crt);
           }else{
               i ++;
           }
       }
       for(int j = 0; j < nums.length; j++){
           if(nums[j] != j){
               return j;
           }
       }
       return -1;
    }

    private static void swap10(int[] nums ,int i, int crt) {
        int temp = nums[i];
        nums[i] = nums[crt];
        nums[crt] = temp;
    }

}
