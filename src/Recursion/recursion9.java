package Recursion;

public class recursion9 {
    static void main(String[] args) {
        System.out.println(main1(5672));
    }

    static int main1(int n) {
        int sum = 0;
        if(n == 0){
            return 0;
        }
        return (n % 10) + main1(n / 10);

    }
}
