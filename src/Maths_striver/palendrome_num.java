package Maths_striver;

// palendrome with negative

public class palendrome_num {
    static void main(String[] args) {
        int x = -121;
        System.out.println(main1(x));
    }

    static boolean main1(int x) {
        if (x < 0) return false;
        int rev = 0;
        int num = x;
        while(x != 0){
            int rem = x % 10 ;
            rev = rev * 10 + rem;
            x /= 10;
        }
        return rev == num;
    }
}
