package My_assignments;

import java.util.Scanner;

public class P_T_R {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        double P = sc.nextDouble();

        System.out.print("Enter Time: ");
        double T = sc.nextDouble();

        System.out.print("Enter Rate: ");
        double R = sc.nextDouble();

        double SI = (P * T * R) / 100;

        System.out.println("Simple Interest = " + SI);
    }
}
