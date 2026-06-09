package Functions_full;

public class Pass_value {
    public static void main(String[] args) {
        int ans = sum5(1,2,3);
        System.out.println(ans);
    }

    // pass the value of the number when you are calling the method in main()
     static int sum5(int a , int b, int c){
        int sum3 = a + b + c;
        return sum3;

     }
}
