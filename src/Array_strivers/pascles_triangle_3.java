package Array_strivers;

//print N row of pascle triangle N = 5

public class pascles_triangle_3 {
    public static void main(String[] args) {
        int n = 5;
        printRow(n);
    }


    static void printRow(int n) {
        long element = 1; // first element is always 1
        System.out.print(element + " ");

        for (int col = 1; col <= n; col++) {
            element = element * (n - col + 1) / col;
            System.out.print(element + " ");
        }
        System.out.println();
    }

}
