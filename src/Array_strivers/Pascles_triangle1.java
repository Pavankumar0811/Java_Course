package Array_strivers;

// full pascles triangle

import java.util.ArrayList;
import java.util.List;

public class Pascles_triangle1 {
    static void main(String[] args) {
        int numRows = 5;
        System.out.println(generate(numRows));
    }

    static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int row = 0; row < numRows; row++) {
            List<Integer> currentRow = new ArrayList<>();

            for (int col = 0; col <= row; col++) {
                if (col == 0 || col == row) {
                    // edges of the triangle are always 1
                    currentRow.add(1);
                } else {
                    List<Integer> prevRow = triangle.get(row - 1);
                    int value = prevRow.get(col - 1) + prevRow.get(col);
                    currentRow.add(value);
                }
            }

            triangle.add(currentRow);
        }

        return triangle;
    }
}
