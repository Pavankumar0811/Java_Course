package YTbegning;

public class Type_Casting {

    public static void main() {

        // this is type casting converting the float into int
        // I cannot do for double
        int a = (int)(12.5f);

        // converting the int into double or float
        double b = (double)(12);

        System.out.println(a);
        System.out.println(b);

        // maximum a byte can store is 256 i had provided 257 so it will give remianing value that is 2
        int z = 258;
        byte c = (byte)(z);

        System.out.println(c);

        byte d = 20;
        byte e = 60;
        byte g = 127; // it is the last capacity
        int h = d*e/g;
        System.out.println(h);

        // in this it will perform the intger operation if it was byte it cannot do that operation
        double f = (double)(d*e/g);
        System.out.println(f);

    }
}
