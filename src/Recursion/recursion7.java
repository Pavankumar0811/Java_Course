package Recursion;

public class recursion7 {
    static void main(String[] args) {
     rev(5);
     rev2(5);
    }

    static void rev(int n) {
        if(n == 0){
         return;
        }
        System.out.print(n + " ");
        rev(n-1);
    }
    static void rev2(int n) {
        if(n == 0){
          return;
        }

        rev2(n-1);   // till here until its finish
        System.out.print(n + " ");
    }
}
