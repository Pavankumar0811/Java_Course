package My_assignments;

//1.5 Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.

import java.util.Scanner;

public class Sum_x_stop {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(true){
            System.out.println("Enter the number");
            String num = sc.next();

            if(num.equalsIgnoreCase("x") || num.equals("z")){      //.equls also can be used
               break;                                                          // we can use || only if it is added equals
            }
            sum = sum + Integer.parseInt(num);

        }
        System.out.println("Sum = " + sum);

         sc.close();
    }
}
