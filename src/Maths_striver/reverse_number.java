package Maths_striver;

// its for negative number also

public class reverse_number {
    static void main(String[] args) {
        int x = -121;
        System.out.println(main1(x));
    }

    static int main1(int x) {
        int rev = 0;  // use long to avoid overflow

        while(x != 0) {  // or (x > 0) for only positive
            int rem = x % 10;
            rev = rev * 10 + rem;
            x = x / 10;
        }

        return rev;   // long casting to int if long
    }
}
