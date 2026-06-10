package My_assignments;

//2.1Write a program to print whether a number is even or odd, also take input from the user.

import java.util.Scanner;

public class Even_odd {
    public static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check even or odd");
        int num = sc.nextInt();

       if(num<1){
           System.out.println("neither even or odd");
       } else if (num%2==0) {
           System.out.println("The number is even");
       }else{
           System.out.println("The number is odd");
       }




    }
}
