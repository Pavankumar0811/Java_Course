package Functions_full;

public class Shadowing {

    static int a = 10;

   public  static void main() {// main function
       System.out.println(a);
       a = 20;        // if I modify this here it will modify entire thing

       int a = 30;

       System.out.println(a);    // print 30
       fun();                    // print 20
       fun2();                   // print 20
    }

    static void fun() {               // another function
        System.out.println(a);
    }
    static void fun2() {// 2nd function
        System.out.println(a);
    }
}
