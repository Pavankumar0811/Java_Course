package My_assignments;

import java.util.Scanner;

//Volume = Base Area × Height

public class Vol_prism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base area: ");
        double b = sc.nextDouble();

        System.out.print("Enter height: ");
        double h = sc.nextDouble();

        double volume = b * h;

        System.out.printf("Volume of Prism = %.2f", volume);
    }
}
