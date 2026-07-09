package Recursion;

// function call

public class recursion1 {
    public static void main(String[] args) {
        main1(1);
    }

    static void main1(int n) {
        System.out.println(n);
        main2(2);
    }

    static void main2(int n) {
        System.out.println(n);
        main3(3);
    }

    static void main3(int n) {
        System.out.println(n);
        main4(4);
    }

    static void main4(int n) {
        System.out.println(n);
    }
}
