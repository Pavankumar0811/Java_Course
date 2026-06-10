package My_assignments;

//2.1Write a program to print whether a number is even or odd, also take input from the user.

import java.util.Scanner;

public class For_odd_evn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers to check: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number: ");
            int num = sc.nextInt();

            if (num % 2 == 0)
                System.out.println(num + " is Even.");
            else
                System.out.println(num + " is Odd.");
        }
    }
}
