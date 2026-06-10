package My_assignments;

//CSA = 2 × π × r × h

import java.util.Scanner;

public class curved_suf_area_cyl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        System.out.print("Enter height: ");
        double h = sc.nextDouble();

        double csa = 2 * Math.PI * r * h;

        System.out.printf("Curved Surface Area of Cylinder = %.2f", csa);
    }
}
