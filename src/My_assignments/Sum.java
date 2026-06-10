package My_assignments;

//1.2 Take two numbers and print the sum of both.

import java.util.Scanner;

public class Sum {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the first number: ");
        int n = sc.nextInt();
        System.out.print("enter the Second number: ");
        int n2 = sc.nextInt();

        int sum = n + n2;
        System.out.println("The sum is " + sum);

        sc.close();
    }
}
