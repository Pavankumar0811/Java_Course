package Pattern_questions;

public class pattern18 {
    static void main(String[] args) {
        int n = 5;
        for(int i = 1; i <= n; i++){
            int start;
            if(i % 2 == 0){
                start = 0;  // even row starts with 0
            }else{
                start = 1;  // odd row starts with 1
            }
            for(int j = 1; j <= i; j++){
                System.out.print(start + " ");
                start = 1 - start;  // toggle 0→1 or 1→0
            }
            System.out.println();
        }
    }
}
