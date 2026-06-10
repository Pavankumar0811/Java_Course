package My_assignments;

//Volume = (1/3) × π × r² × h

import java.util.Scanner;

public class vol_cone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        System.out.print("Enter height: ");
        double h = sc.nextDouble();

        double volume = (1.0 / 3) * Math.PI * r * r * h;     //Use 1.0/3 instead of 1/3 to avoid integer division!

        System.out.printf("Volume of Cone = %.2f", volume);
    }
}
