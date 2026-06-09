package Conditional_Lopps;

import java.util.Scanner;

public class Calculator {
    public static void main() {
        int ans = 0;
        Scanner in =  new Scanner(System.in);
        System.out.print("Enter number: ");
        int a = in.nextInt();

        System.out.print("Enter number: ");
        int b = in.nextInt();

        System.out.print("Enter operator('+' , '-' , '*' , '/' , '%'): ");
        char ch = in.next().trim().charAt(0);


            if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {
                if (ch == '+') {
                    ans = a + b;
                }
                if (ch == '-') {
                    ans = a - b;
                }
                if (ch == '*') {
                    ans = a * b;
                }
                if (ch == '/') {
                    if (a != 0) {
                        ans = a / b;
                    } else {
                        ans = 0;
                    }
                }
                if (ch == '%') {
                    ans = a % b;
                }
            }else {
                System.out.println("Invalid input");
            }
            System.out.print("The output is: " + ans);

    }
}
