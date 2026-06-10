package My_assignments;

//Area = (√3 / 4) × a²

import java.util.Scanner;

public class area_equi_tri {
    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sides: ");
        double a = sc.nextDouble();

        float area = (float) (Math.sqrt(3) / 4 * a * a);
        System.out.println("The area of the equilateral triangle is " + area);
    }
}
