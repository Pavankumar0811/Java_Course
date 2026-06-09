package Array_Arraylist;

public class Max_arr_ran {
    public static void main() {
        int[] arr = {1,2,3,4,5};
        System.out.println(maxRange(arr,2,2));


    }

    static int maxRange(int[] arr,int start,int end) {
        int maxval = arr[start];
        for(int i=start;i<end;i++){
            if(arr[i]>maxval){
                maxval=arr[i];
            }

        }
        return maxval;
    }

}
