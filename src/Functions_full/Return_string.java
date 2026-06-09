package Functions_full;

public class Return_string {
    public static void main(String[] args) {
        String ans = greet();
        System.out.println(ans);

    }

    static String greet(){
        String greeting = "Hello World!";
        return greeting;
    }
}
