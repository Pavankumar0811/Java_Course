package My_assignments;

import java.util.Scanner;

public class Area_tri {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base");
        double base = sc.nextDouble();
        System.out.println("Enter the height");
        double height = sc.nextDouble();

        float area = (float)(0.5 * base * height);
        System.out.println("The area of the circle is " + area);
    }
}
