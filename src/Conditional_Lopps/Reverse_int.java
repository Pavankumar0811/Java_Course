package Conditional_Lopps;

public class Reverse_int {
    public static void main() {
        int n = 10284;

        int ans = 0;

        while(n > 0){
            int rem = n % 10;
            n = n / 10;
            ans = ans * 10 + rem;
        }
        System.out.println(ans);

    }
}
