package My_assignments;

import java.util.Scanner;

// Volume = (4/3) × π × r³

public class vol_sphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        double volume = (4.0 / 3) * Math.PI * r * r * r;    //Use 4.0/3 instead of 4/3 to avoid integer division!

                System.out.printf("Volume of Sphere = %.2f", volume);
    }
}
