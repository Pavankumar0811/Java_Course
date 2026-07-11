package Recursion;

public class recursion11 {
    static void main(String[] args) {
        rev(5);
    }

    static void rev(int n) {
        if(n == 0){
            return;
        }
        System.out.print(n + " ");
        rev(--n);       // n-- it will first give the value that is 5 and then it will subtract print like infinite 5 output
                        // --n it will first subtract and the give the value
    }
}
