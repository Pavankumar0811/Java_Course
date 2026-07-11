package Maths_striver;

public class Prime {
    static void main(String[] args) {
        int n = 98;
        System.out.println(main1(n));
    }

    public static boolean main1(int n) {
        if (n < 2) return false; // 0 and 1 are not prime

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count == 2;
    }
}
