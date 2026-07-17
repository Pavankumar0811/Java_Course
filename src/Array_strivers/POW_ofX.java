package Array_strivers;

public class POW_ofX {
    static void main(String[] args) {
      double x = 2.0000;
      int n = 10;
      //int n = -2;

        System.out.println(main1(x, n));
    }

    static double main1(double x, int n) {
        if(n == 0) return 1.0;
        if(x == 0) return 0.0;

        long N = n;
        if(n < 0){
            x = 1/x;
            N = -N;
        }
        double ans = 1;

        while(N > 0){
            if(N % 2 == 1){
                ans *= x;
            }
            x *= x;
            N /= 2;
        }
        return ans;
    }
}
