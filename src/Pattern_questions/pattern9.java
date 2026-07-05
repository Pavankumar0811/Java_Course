package Pattern_questions;

public class pattern9 {
    static void main(String[] args) {
        int n = 5;
// upper half
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            System.out.print("*");
            if(i > 1){
                for(int j = 1; j <= 2*i-3; j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
// lower half
        for(int i = n-1; i >= 1; i--){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            System.out.print("*");
            if(i > 1){
                for(int j = 1; j <= 2*i-3; j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
