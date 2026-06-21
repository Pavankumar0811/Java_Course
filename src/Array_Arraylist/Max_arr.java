package Array_Arraylist;

public class Max_arr {
    public static void main() {
        int[] arr = {1,2,3,4,5,10,0,2};
        System.out.println(max(arr));


    }

    static int max(int[] arr){
      int maxval = arr[0];
      for(int i=0;i<arr.length;i++){
        if(arr[i]>maxval){
            maxval=i;
        }
      }
      return maxval;
    }

}
