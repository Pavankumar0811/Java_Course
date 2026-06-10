package My_assignments;

// 2.4 Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class calc_sum {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int n1 = sc.nextInt();
        System.out.println("Enter the second number");
        int n2 = sc.nextInt();
        System.out.println("Enter the operator to perform (+, -, *, /, %): ");
        char ch = sc.next().trim().charAt(0);

        if(ch=='+') {
            int sum = n1 + n2;
            System.out.println(sum);
        }
        else if (ch=='-') {
            int sum = n1 - n2;
            System.out.println(sum);
        }
        else if(ch=='*') {
            int sum = n1 * n2;
            System.out.println(sum);
        }
        else if(ch=='/') {
            int sum = n1 / n2;
            System.out.println(sum);
        }
        else if(ch=='%') {
            int sum = n1 % n2;
            System.out.println(sum);
        }



        sc.close();
    }
}
