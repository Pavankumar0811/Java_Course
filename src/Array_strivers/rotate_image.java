package Array_strivers;

import java.util.Arrays;

public class rotate_image {
    static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.deepToString(main1(matrix)));
    }

    static int[][] main1(int[][] matrix) {
        int n = matrix.length;
        int[][] temp = new int[n][n];  // extra matrix

        // copy rotated elements to temp
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                temp[j][n-1-i] = matrix[i][j];
                // row i, col j → row j, col n-1-i
            }
        }

        // copy temp back to matrix
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matrix[i][j] = temp[i][j];
            }
        }
        return matrix;
    }
}
