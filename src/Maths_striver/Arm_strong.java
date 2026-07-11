package Maths_striver;

public class Arm_strong {
    public static void main(String[] args) {
        int n = 371;
        System.out.println(main1(n));
    }

    public static boolean main1(int n) {
        int sum = 0;
        int dup = n;

        while(n != 0){
            int rem = n % 10;
            sum = sum + (rem * rem * rem);
            n = n / 10;
        }
        return sum == dup;
    }
}
