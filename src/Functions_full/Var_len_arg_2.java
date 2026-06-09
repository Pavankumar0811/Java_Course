package Functions_full;

import java.util.Arrays;

public class Var_len_arg_2 {
    public static void main() {
        gree("pavan", "kumar", "spoorthi" , "love");
    }

    static void gree(String...v){
        System.out.println(Arrays.toString(v));     // if we want to use we should have to make it Array.toString(v)

        System.out.println(v.length);
    }
}
