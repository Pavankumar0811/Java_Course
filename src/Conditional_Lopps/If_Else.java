package Conditional_Lopps;

import java.util.Scanner;

public class If_Else {
   public static void main() {
        Scanner sc = new Scanner(System.in);
       System.out.print("Enter your sallery :");
       int sallery = sc.nextInt();

       if(sallery>=10000){
           sallery = sallery + 2000;  // sallery+=2000
       }else if (sallery==8000){
           sallery = sallery + 10000;
       }else{
           sallery+=20000;
       }
       System.out.println(sallery);

    }
}
