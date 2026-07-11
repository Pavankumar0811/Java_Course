package Maths_striver;

public class prime_optimal {
    static void main(String[] args) {
        int n = 97;
        System.out.println(main1(n));
    }

    static boolean main1(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i * i <= n; i= i+ 2) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
