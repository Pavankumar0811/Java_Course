package Binary_search;

public class search20_sqrt {
    static void main(String[] args) {
      int x = 81;
        System.out.println(search(x));
    }

    public static int search( int x)  {
        int start = 1;
        int end = x;
        int result = 0;

        while(start <= end) {
            long mid = start + (end - start) / 2;  // long to avoid overflow

            if(mid * mid == x) {
                return (int)mid;         // exact square root
            } else if(mid * mid < x) {
                result = (int)mid;       // store candidate
                start = (int)mid + 1;   // go right
            } else {
                end = (int)mid - 1;     // go left
            }
        }
        return result;
    }
}
