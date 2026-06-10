package My_assignments;

import java.util.Scanner;

// Area = (b/4) × √(4a² - b²)

public class Area_iso_tri {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the base");
            double b = sc.nextDouble();
            System.out.println("Enter equal side");
            double a = sc.nextDouble();

            float area = (float)(b/4 * Math.sqrt(4 * a * a - b * b ));
            System.out.println("The area of the Isosceles triangle is " + area);

    }
}
