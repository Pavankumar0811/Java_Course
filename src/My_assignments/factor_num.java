package My_assignments;


import java.util.Scanner;

public class factor_num {
    //Factors are numbers that divide a number completely (no remainder).

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Factors of " + n + ":");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                System.out.println(i);
        }
    }
}
