package Maths_striver;

public class cout {
    static void main(String[] args) {
        int n = 12345;

        System.out.println(main1(n));
    }

    static int main1(int n) {
        int count = 0;
        int sum =0;

        while(n > 0){
            int extract = n % 10;
            count++;
           n = n / 10;
           sum = sum * 10 + extract;

        }
        return count;
    }
}
