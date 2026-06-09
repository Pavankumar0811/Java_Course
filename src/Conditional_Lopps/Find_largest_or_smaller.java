package Conditional_Lopps;

import java.util.Scanner;

public class Find_largest_or_smaller {

    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int a = sc.nextInt();
        System.out.println("enter a number");
        int b = sc.nextInt();
        System.out.println("enter a number");
        int c = sc.nextInt();

        // same way we can find minimun
        int max = a;
        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }

        System.out.println(max);




       /*
        // this is the another short method to find the max or min

        int max = Math.max(c,Math.max(a,b));
        System.out.println(max);

        */

    }





}
