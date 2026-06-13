package Linear_search;

import java.util.Arrays;

public class search9_min_2d_fun {
    public static void main(String[] args) {
        int[][] arr = {
                {2, 20 , 30 },
                {1000 , 50 , 80},
                {90, 1}
        };

        //System.out.print(Arrays.deepToString(arr));
        System.out.println(search(arr));
    }

    static int search(int[][] arr) {
         int min = arr[0][0];
        for(int i = 0 ; i <arr.length ; i ++){
            for(int j = 0 ; j < arr[i].length ; j++){
                if(arr[i][j]<min){
                    min = arr[i][j];

                }
            }

        }
        return min;
    }
}
