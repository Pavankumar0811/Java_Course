package Maths_striver;

public class divisible_num {
    static void main(String[] args) {
        int n = 36;
        main1(n);
    }

    static void main1(int n ) {
        for(int i = 1; i <=n ; i++  ){
           if(n % i == 0){
               System.out.print(i + " ");
           }
        }
    }
}
