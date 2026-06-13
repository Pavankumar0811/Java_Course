package Functions_full;

import java.util.Scanner;

public class Arm {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int orginal = n;
        int rev = 0;

        while(n > 0){
            int a = n % 10;
            rev = rev + a * a * a;
            n = n / 10;
        }
        if(rev == orginal){
            System.out.println("Arm Strong");
        }
        else{
            System.out.println("Not Arm Strong");
        }
    }

}
