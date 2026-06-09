package Conditional_Lopps;

import java.util.Scanner;

public class Fibo_series {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to series");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        while(count<=n){
            int temp = b;
            b = b +a ;
            a = temp;
            System.out.println(b);
            count++;
        }
       // System.out.println(b);
       sc.close();
    }
}
