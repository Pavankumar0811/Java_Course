package Functions_full;

import java.util.Scanner;

public class Basic_sum {
    public static void main() {
        sum();
        sum();

    }
    static void sum() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number");
        int first = input.nextInt();
        System.out.println("Please enter the second number");
        int second = input.nextInt();
        System.out.println("Please enter the third number");
        int third = input.nextInt();
        int sum = first + second + third;
        System.out.println("The sum is: " + sum);
    }
}
