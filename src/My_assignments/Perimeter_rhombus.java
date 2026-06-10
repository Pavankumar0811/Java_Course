package My_assignments;

import java.util.Scanner;

public class Perimeter_rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side: ");
        double a = sc.nextDouble();

        double perimeter = 4 * a;

        System.out.printf("Perimeter of Rhombus = %.2f", perimeter);
    }
}
