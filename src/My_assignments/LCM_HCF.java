package My_assignments;

//1.4 Take 2 numbers as inputs and find their HCF and LCM.

import java.util.Scanner;

public class LCM_HCF {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        int hcf=0;

        for(int i=1;i<=a && i<=b;i++){
            if(a % i==0 && b % i==0){
                hcf = i;

            }
        }
        int lcm = (a * b) / hcf;

        System.out.println("HCF = " + hcf);
        System.out.println("LCM = " + lcm);


    }
}
