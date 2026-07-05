package Pattern_questions;

public class pattern10 {
    static void main(String[] args) {
        int n = 5;
        for(int i = 0; i < n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }
            int val = 1;
            for(int j = 0; j <= i; j++){
                System.out.print(val + " ");
                val = val * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
