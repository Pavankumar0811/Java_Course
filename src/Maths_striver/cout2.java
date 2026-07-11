package Maths_striver;

import static java.lang.Math.log10;

// another method to solve count

public class cout2 {
    static void main(String[] args) {
        int n = 12345;

        System.out.println(main1(n));
    }

    static int main1(int n) {
        int count = (int) (log10(n) + 1);

        return count;
    }
}
