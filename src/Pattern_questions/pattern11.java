package Pattern_questions;

public class pattern11 {
    static void main(String[] args) {
        int n = 5;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= 2*n; j++){
                if(i==1 || i==n || j==1 || j==2*n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
