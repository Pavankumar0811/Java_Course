package My_assignments;

import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start: ");
        int start = sc.nextInt();

        System.out.print("Enter end: ");
        int end = sc.nextInt();

        System.out.println("Armstrong Numbers:");
        for (int i = start; i <= end; i++) {
            int a = 0, b = i;

            while (b != 0) {
                int n = b % 10;
                a = a + n * n * n;
                b = b / 10;
            }

            if (a == i)
                System.out.println(i);
        }
    }
}
