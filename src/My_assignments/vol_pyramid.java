package My_assignments;

//Volume = (1/3) × l × w × h

import java.util.Scanner;

public class vol_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base length: ");
        double l = sc.nextDouble();

        System.out.print("Enter base width: ");
        double w = sc.nextDouble();

        System.out.print("Enter height: ");
        double h = sc.nextDouble();

        double volume = (1.0 / 3) * l * w * h;     //Use 1.0/3 instead of 1/3 to avoid integer division!

        System.out.printf("Volume of Pyramid = %.2f", volume);
    }
}
