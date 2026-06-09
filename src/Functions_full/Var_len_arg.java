package Functions_full;

import java.util.Arrays;

public class Var_len_arg {
    static void main() {
        len_arg(10,20,30);                 // for len_arg

        len_arg2(20,4353,53,4,4645646);       // for len_arg2
    }

    static void len_arg(int a, int b , int c) {
        int num = a + b + c;
        System.out.println(num);
                                                      // see if i print the len_arg2 in len_arg it will print
        len_arg2(10,20,30,40,564,64,75,757,675);   // for len_arg2
    }

    static void len_arg2(int...v) {
        System.out.println(v.length);             // length of array
        System.out.println(Arrays.toString(v));   // to give the set of intergers in a array format
    }
}
