package My_assignments;

import java.util.Scanner;

public class Area_circle {
    public static void main() {
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        double r = sc.nextDouble();

        float area = (float)(Math.PI * r * r);
        System.out.println("The area of the circle is " + area);
    }
}
