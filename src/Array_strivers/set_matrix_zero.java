package Array_strivers;

// time = O(m*n)  space = O(m*n)

import java.util.Arrays;

public class set_matrix_zero {
    public static void main(String[] args) {
        int[][] matrix = {
                {0,1,2,0},
                {3,4,0,2},
                {1,3,1,5}
        };
        setZeroes(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }

    public static void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean[] zeroRows = new boolean[rows];
        boolean[] zeroCols = new boolean[cols];

        // Step 1: find which rows and cols have zeros
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(matrix[i][j] == 0){
                    zeroRows[i] = true;
                    zeroCols[j] = true;
                }
            }
        }

        // Step 2: set zeros
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(zeroRows[i] || zeroCols[j]){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
