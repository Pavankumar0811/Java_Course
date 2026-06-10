package My_assignments;

import java.util.Scanner;

public class Palandrome {
    public static void main() {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String str = sc.next();

            String rev = "";

            for (int i = str.length() - 1; i >= 0; i--) {
                rev += str.charAt(i);
            }

            if (str.equals(rev))
                System.out.println(str + " is a Palindrome.");
            else
                System.out.println(str + " is NOT a Palindrome.");
        }
    }

