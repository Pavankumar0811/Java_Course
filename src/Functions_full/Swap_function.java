package Functions_full;

public class Swap_function {
   public static void main() {
       int ans = swap(20 ,30);
       System.out.println(ans);
    }

    static int swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        return a;
    }
}
