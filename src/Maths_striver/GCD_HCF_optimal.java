package Maths_striver;

// Euclidean algorithm

// O(log(min(n1, n2)))

public class GCD_HCF_optimal {
    public static void main(String[] args) {
        int n1 = 11;
        int n2 = 13;

        System.out.println(gcd(n1, n2));
    }

    public static int gcd(int n1, int n2) {
        while (n2 != 0) {
            int temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }
        return n1;
    }
}
