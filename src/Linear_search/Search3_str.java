package Linear_search;

import java.util.Scanner;

public class Search3_str {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = input.nextLine();
        System.out.println("Enter the character");
        char ch = input.next().charAt(0);

        System.out.println(count(str,ch));

    }

    static boolean count(String str,char ch){
        for(int i = 0 ; i < str.length(); i++){
            if(ch == str.charAt(i)){
             return true;
            }
        }
        return false;
    }
}
