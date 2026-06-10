package My_assignments;

import java.util.Scanner;

public class Rup_Us {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("To convert rupees to USD press '&' OR To convert USD to rupees press '$' ");
        char ch = sc.next().trim().charAt(0);


        if (ch=='&') {
            System.out.println("enter the rupees you want to convert to USD ");
            double rupe = sc.nextDouble();
            double USD = rupe * 0.0105;
            System.out.println(USD + " USD");
        }else if (ch=='$') {
            System.out.println("enter the USD you want to convert to Rupees ");
            double USD = sc.nextDouble();
            float Rupees = (float) (USD * 95.18f);
            System.out.println(Rupees + " Rupees");
        }else{
            System.out.println("Invalid Input");
        }
    }
}
