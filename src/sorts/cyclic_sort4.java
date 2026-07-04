package sorts;

public class cyclic_sort4 {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};

        System.out.println(search(arr));
    }

    public static int search(int[] arr){
        int i =0 ;
        while(i < arr.length){
            int crt = arr[i]-1;
            if(arr[i] != arr[crt]){
                int temp = arr[i];
                arr[i] = arr[crt];
                arr[crt] = temp;
            }else{
                i ++;
            }
        }
        for(int j =0;j<arr.length;j++){
            if(arr[j] != j+1){
                return arr[j];
            }
        }
        return arr.length;
    }
}
