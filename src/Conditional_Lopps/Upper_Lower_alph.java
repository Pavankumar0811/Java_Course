package Conditional_Lopps;

import java.util.Scanner;

public class Upper_Lower_alph {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the char to check uppercase and lowercase: ");
        char ch = sc.next().trim().charAt(0);

        if(ch >= 'a' &&  ch <= 'z' ){
            System.out.println("lower case");

        }else if(ch >= 'A' &&  ch <= 'Z' ){
            System.out.println("upper case");

        }else{
            System.out.println("Special character");
        }


    }
}
