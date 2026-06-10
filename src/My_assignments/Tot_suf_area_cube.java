package My_assignments;

//TSA = 6 × a²

import java.util.Scanner;

public class Tot_suf_area_cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side: ");
        double a = sc.nextDouble();

        double tsa = 6 * a * a;

        System.out.printf("Total Surface Area of Cube = %.2f", tsa);
    }
}
