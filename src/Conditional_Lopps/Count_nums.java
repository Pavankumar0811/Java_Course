package Conditional_Lopps;

public class Count_nums {
    public static void main() {

        // it is used to check number of 3 in the 'a'
        int a = 123435;

        int count = 0;

        while(a >0){
            int rem = a % 10;
            if(rem == 3){
             count++;
            }
            a = a / 10;
        }
        System.out.println(count);
    }
}
