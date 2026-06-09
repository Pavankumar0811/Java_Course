package Functions_full;

import java.util.Arrays;

public class Overloading {       // both the function can be of same name but the datatype or the arguments must be different
    public static void main() {
        ret(10,20,30);   // it will run 2nd one

        re("pavan" , "kumar");

        // re();        // it will give error
    }

    static void ret(int a,int b){    // 1st one
        System.out.println(a+b);
    }

    static void ret(int a,int b,int c){   // 2nd one
        System.out.println(a+b+c);
    }

    static void re(int...v){   // 2nd one
        System.out.println(Arrays.toString(v));
    }

    static void re(String...v){   // 2nd one
        System.out.println(Arrays.toString(v));
    }


}
