package Array_strivers;

public class subarray_sumk_sametwosum {
    static void main(String[] args) {
        int[] arr = {1,2,3};
        int k = 3;

        System.out.println(main1(arr, k));
    }

    static int main1(int[] arr, int k) {
      int count = 0;

      for(int i=0;i<arr.length;i++){
          int sum = 0;
          for(int j=i;j<arr.length;j++){
            sum = sum + arr[j];
            if(sum==k) count++;
          }
      }
      return count;
    }
}
