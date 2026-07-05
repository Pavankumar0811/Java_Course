package Pattern_questions;

public class pattern14 {
    static void main(String[] args) {
        int n = 5;
        char ch = 'a';
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}
