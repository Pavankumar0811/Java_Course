package My_assignments;

//1.3 Take a number as input and print the multiplication table for it.

import java.util.Scanner;

public class Multiplication_tab {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the table number you want to do:");
        int n = sc.nextInt();

        for(int i =1; i<=10;i++){
            System.out.println(n + " x " + i + " = " + (n*i));
        }
        sc.close();
    }
}
