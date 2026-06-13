package Linear_search;

public class search8_min_2d {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 90 ,0},
                {50, 30, 10},
                {-1,70}
        };
         int min = arr[0][0];
        for(int i = 0 ; i< arr.length; i++){
            for(int j = 0 ; j< arr[i].length; j++){
                if(arr[i][j]<min){
                    min = arr[i][j];
                }
            }
        }
        System.out.println("Minimum number is "+min);
    }
}
