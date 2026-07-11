package Maths_striver;

//O(min(n1, n2))

// GCD = GREATEST COMMON DEVISIOR
// HCF = HIGHEST COMMON FACTOR

public class GCD_HCF {
    public static void main(String[] args) {
        int n1 = 11;
        int n2 = 13;

        System.out.println(main1(n1,n2));
    }

    public static int main1(int n1, int n2) {
        int GCD = 1;
    for(int i = 1; i <= Math.min(n1,n2); i++){
        if(n1 % i == 0 && n2 % i == 0){
           GCD = i;
        }
    }
    return GCD;
    }
}
