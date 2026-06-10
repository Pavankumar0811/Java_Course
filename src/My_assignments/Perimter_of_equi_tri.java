package My_assignments;

import java.util.Scanner;

public class Perimter_of_equi_tri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side: ");
        double a = sc.nextDouble();

        double perimeter = 3 * a;

        System.out.printf("Perimeter of Equilateral Triangle = %.2f", perimeter);
    }
}
