package Array_strivers;
//given r and c find the element that place r= 5 c=3

public class pascles_triangle_2 {
    public static void main(String[] args) {
        int r = 5;
        int c = 3;
        System.out.println(getElement(r, c));
    }


    static int getElement(int r, int c) {
        long res = 1;
        // C(r, c) = r! / (c! * (r-c)!)
        for (int i = 0; i < c; i++) {
            res = res * (r - i);
            res = res / (i + 1);
        }
        return (int) res;
    }

}
