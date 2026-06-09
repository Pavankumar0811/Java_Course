package Functions_full;

import java.util.Scanner;

public class ArmStrong_function {
   public static void main() {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();

        boolean ans = isArmStrong(n);
       System.out.println(ans);

//       for(int i = 100; i < 1000 ; i++){                 // this is for loop to determine all the 3 digit armstrong number
//           if(isArmStrong(i)){
//               System.out.print(i + " Arm Strong ");
//           }
//       }

    }

    static boolean isArmStrong(int n){
       int orginal = n;
       int sum = 0;

       while(n>0){
           int rem = n%10;
           n = n/10;
           sum = sum + rem*rem*rem;
       }
       if(sum==orginal){
           return true;
       }
       return false;
    }
}
