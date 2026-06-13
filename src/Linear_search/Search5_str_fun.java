package Linear_search;

import java.util.Arrays;
import java.util.Scanner;

public class Search5_str_fun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String name = sc.nextLine();
        System.out.println("Enter the character");
        char ch = sc.next().trim().charAt(0);

        System.out.println(ischar(name, ch ));  // this will print true or false

        System.out.println(Arrays.toString(name.toCharArray()));   // this is to print in array format
    }

    static boolean ischar(String name , char ch){

        for(int i = 0 ; i < name.length();i ++){
            if(ch == name.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
