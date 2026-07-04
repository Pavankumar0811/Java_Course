package sorts;

public class cyclic_sort2 {
    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};

        System.out.println(search(arr));
    }

    public static int search(int[] arr){
        int i =0 ;
        while(i < arr.length){
            int crt = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[crt]){
                int temp = arr[i];
                arr[i] = arr[crt];
                arr[crt] = temp;
            }else{
                i ++;
            }
        }
        for(int j =0;j<arr.length;j++){
           if(arr[j] != j){
               return j;
           }
        }
        return arr.length;
    }
}
