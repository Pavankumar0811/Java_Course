package Array_strivers;

import java.util.Arrays;

public class set_matrix_zero_optimal {
    static void main(String[] args) {
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

        boolean firstRowHasZero = false;
        boolean firstColHasZero = false;

        // Step 1: check if first row has zero
        for(int j = 0; j < cols; j++){
            if(matrix[0][j] == 0){
                firstRowHasZero = true;
                break;
            }
        }

        // Step 2: check if first col has zero
        for(int i = 0; i < rows; i++){
            if(matrix[i][0] == 0){
                firstColHasZero = true;
                break;
            }
        }

        // Step 3: use first row and col as markers
        for(int i = 1; i < rows; i++){
            for(int j = 1; j < cols; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;  // mark row
                    matrix[0][j] = 0;  // mark col
                }
            }
        }

        // Step 4: set zeros based on markers
        for(int i = 1; i < rows; i++){
            for(int j = 1; j < cols; j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

        // Step 5: handle first row
        if(firstRowHasZero){
            for(int j = 0; j < cols; j++){
                matrix[0][j] = 0;
            }
        }

        // Step 6: handle first col
        if(firstColHasZero){
            for(int i = 0; i < rows; i++){
                matrix[i][0] = 0;
            }
        }
    }
}
