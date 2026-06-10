package My_assignments;

import java.util.Scanner;

public class Area_rectangle {
    public static void main() {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the length");
            double length = sc.nextDouble();
            System.out.println("Enter the bredth");
            double bredth = sc.nextDouble();

            float area = (float)(length * bredth);
            System.out.println("The area of the rectangle is " + area);
    }
}
