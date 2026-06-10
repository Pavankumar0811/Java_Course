package My_assignments;

import java.util.Scanner;

public class Rhombus {
    public static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the diagonal 1: " );
        double d1 = sc.nextDouble();
        System.out.println("Enter the diagonal 2: ");
        double d2 = sc.nextDouble();

        float area = (float)(d1 * d2/2);
        System.out.println("The area of the Rhombus is " + area);
    }
}
