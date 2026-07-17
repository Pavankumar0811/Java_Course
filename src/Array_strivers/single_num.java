package Array_strivers;

public class single_num {
    static void main(String[] args) {
        int[] arr = {4,1,2,1,2};

        System.out.println(main1(arr));
    }

    static int main1(int[] arr) {

      for(int i = 0;i<arr.length;i++){
          int count = 0;
          for(int j = 0;j<arr.length;j++){
              if(arr[i]==arr[j]){
                  count++;
              }
          }
          if(count == 1) {
              return arr[i];
          }
      }
      return -1;
      }
}
