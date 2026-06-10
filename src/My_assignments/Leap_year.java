package My_assignments;

 //1.1 Input a year and find whether it is a leap year or not.

import java.util.Scanner;

public class Leap_year {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if(year%400==0){
            System.out.println("Leap year");
        }else if(year%100==0){
            System.out.println("not Leap year");
        }else if(year%4==0){
            System.out.println("Leap year");
        }else{
            System.out.println("not Leap year");
        }

        sc.close();
    }
}
