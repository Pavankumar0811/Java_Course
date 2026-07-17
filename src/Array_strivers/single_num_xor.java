package Array_strivers;

public class single_num_xor {
    static void main(String[] args) {
        int[] arr = {4,1,2,1,2,};      // xor 2 ^ 2 = 0 , 1 ^ 1 = 0 , remaining = 4 , if it contains 3 element like 2 ^ 2 ^ 2 then it will not work
        System.out.println(main1(arr));
    }

    static int main1(int[] nums) {
        int xor = 0;

        for(int i = 0; i < nums.length; i++){
            xor = xor ^ nums[i];  // XOR all elements
        }

        return xor;
    }
}
