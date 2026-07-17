package Maths_striver;

public class Sample {
    static void main(String[] args) {
        int n = 98;
        System.out.println(main1(n));
    }

    static boolean main1(int n) {
        int count = 0;
       for(int i = 1; i <= n; i++) {
           if(n % i== 0){
              count ++;
           }
       }
       return count == 2;

    }
}
