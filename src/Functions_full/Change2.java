package Functions_full;

public class Change2 {
    public static void main() {
        int ans = 20;
        pass(ans);
        System.out.println(ans);
    }

    static void pass(int a) {
        int ans = 10;      // it is only pass by value not the pass by refernce
    }
}
