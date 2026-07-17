package Array_strivers;

import java.util.ArrayList;
import java.util.List;

public class spiral_matrix_optimal {
    static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {6 ,7 ,8 ,9, 10},
                {11,12,13,14,15},
        };
        System.out.println(main1(matrix));
    }

    static List<Integer> main1(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while(top <= bottom && left <= right){

            // move right → top row
            for(int i = left; i <= right; i++){
                result.add(matrix[0][i]);
            }
            top++;

            // move down → right col
            for(int i = top; i <= bottom; i++){
                result.add(matrix[i][right]);
            }
            right--;

            // move left → bottom row
            if(top <= bottom){
                for(int i = right; i >= left; i--){
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // move up → left col
            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }
}
