package My_assignments;

import java.util.Scanner;

public class perimeter_square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side: ");
        double a = sc.nextDouble();

        double perimeter = 4 * a;

        System.out.printf("Perimeter of Square = %.2f", perimeter);
    }
}
