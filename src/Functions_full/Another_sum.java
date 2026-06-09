package Functions_full;

import java.util.Scanner;

public class Another_sum {
    public static void main(String[] args) {
        int ans = sum2();
        System.out.println(ans);
    }
    static int sum2(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number");
        int first = input.nextInt();
        System.out.println("Please enter the second number");
        int second = input.nextInt();
        System.out.println("Please enter the third number");
        int third = input.nextInt();
        int sum2 = first + second + third;
        input.close();
        return sum2;




        // this line will not excute once the return is done
       //  System.out.println("The sum is: " + sum);
    }
}
