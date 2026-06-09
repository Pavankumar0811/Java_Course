package Functions_full;

public class Block_scoping2 {
    static void main() {
        int a = 10;
        int b = 20;
       // c =40;                              // anything that is outside you can use inside but anything that is inside you cannot use outside
        {
            a = 50;
       //     int c = 20;                     // anything that is outside you can use inside but anything that is inside you cannot use outside
            System.out.println(a);
        }
        System.out.println(a);

        // for loop
        for(int i = 0; i < 4; i++) {
            System.out.println(i);
        }

    }
}
