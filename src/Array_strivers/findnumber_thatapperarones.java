package Array_strivers;

public class findnumber_thatapperarones {
    static void main(String[] args) {
        int[] nums = {4,1,2,1,2};

        System.out.println(main1(nums));
    }

    static int main1(int[] nums) {
        int xor = 0;

        for(int i = 0; i < nums.length; i++){
            xor = xor ^ nums[i];  // XOR all elements
        }

        return xor;
    }
}
