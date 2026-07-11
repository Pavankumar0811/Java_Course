package Recursion;

public class recursion8 {
    static void main(String[] args) {
        System.out.println(fact(5));
    }

    static int fact(int n) {
        if(n <= 1){
            return 1;
        }

        int ans = n*fact(n-1);
        return ans;

    }
}
