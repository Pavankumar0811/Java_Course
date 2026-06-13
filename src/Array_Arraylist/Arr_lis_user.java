package Array_Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Arr_lis_user {
    public static void main() {

        ArrayList<String> list = new ArrayList<String>(10);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of fruit: ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            System.out.println("Enter the fruit name: ");
            String fruit = sc.next();
            list.add(fruit);
        }
        System.out.println(list);
    }
}
