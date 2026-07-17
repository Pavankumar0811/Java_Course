package Array_strivers;

// if they say n/2 then use this

// moore's algorithm

public class majority_element {
    static void main(String[] args) {
       // int[] arr = {1,2,3,4,5,6};
      int[] arr = {2,1,2,1,2,1,2};

        System.out.println(main1(arr));
    }

    static int main1(int[] arr) {
        int ans = arr[0];
        int freq = 1;
        for (int i = 1; i < arr.length; i++) {
            if (freq == 0) {
                ans = arr[i];
                freq = 1;
            }else if(ans == arr[i]){
                freq++;
            }else{
                freq--;
            }
        }
        return ans;
    }
}
