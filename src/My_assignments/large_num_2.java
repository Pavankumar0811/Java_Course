package My_assignments;

import java.util.Scanner;

public class large_num_2 {
   public static void main() {

           Scanner sc = new Scanner(System.in);

           System.out.print("Enter first number: ");
           int a = sc.nextInt();

           System.out.print("Enter second number: ");
           int b = sc.nextInt();

           if (a > b)
               System.out.println(a + " is Largest.");
           else
               System.out.println(b + " is Largest.");

           sc.close();
       }

    }
