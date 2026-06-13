package Functions_full;

import java.util.Arrays;

public class Var_mix {
    public static void main() {
        mix(10,20,"pavan", "kumar");
    }

    static void mix(int a, int b, String...v) {
        System.out.println(a + b);
        System.out.println(Arrays.toString(v));
    }
}
