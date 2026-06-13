package Linear_search;

import java.util.Scanner;

public class Search4_str {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String name = sc.nextLine();
        System.out.print("enter the character you want to find in the name: ");
        char ch = sc.next().trim().charAt(0);
        int i = 0;

        for(i = name.length()-1 ; i > 0  ; i --){
            if(ch== name.charAt(i)){
                System.out.println("found at index "+i);
                break;
            }

        }if(ch!= name.charAt(i)){
            System.out.println("not found at index ");
        }

    }
}
