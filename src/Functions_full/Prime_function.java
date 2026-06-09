package Functions_full;

import java.util.Scanner;

public class Prime_function {

    public static void main() {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
       int n = sc.nextInt();

       boolean ans = isPrime(n);
        System.out.println(ans);

        sc.close();
    }

    static boolean isPrime(int n) {
      if(n<=1){
          return false;
      }
      int c = 2;
      while(c * c <= n){
        if(n%c ==0){
            return false;
        }
        c++;
      }
      return c * c > n;

    }

}
