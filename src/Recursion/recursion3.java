package Recursion;

public class recursion3 {
    public static void main(String[] args) {
        int ans = fibo(5);       // for 50 it will not give answer
        System.out.println(ans);
    }

    static int fibo(int n) {
        if(n < 2) {
            return n;

        }
        return fibo(n-2) + fibo(n-1);
    }
}
