package Recursion;

public class recursion2 {
    static void main(String[] args) {
        main1(1);
    }

    static void main1(int n) {
        if(n==5){
            System.out.println(n);
            return;
        }
        System.out.println(n);

        // tail recursion
        main1(n + 1);
    }
}
