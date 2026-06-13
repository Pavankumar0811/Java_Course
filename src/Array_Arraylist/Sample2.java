package Array_Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Sample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 0 to begin: ");
        int n = sc.nextInt();


        ArrayList<String> list = new ArrayList<>();

        String str = "";

        if(n == 0) {
            System.out.println("verefied");

            while (true) {
                System.out.println("Press (1) to add the element to list");
                System.out.println("Press (2) to remove the element in list");
                System.out.println("Press (3) to check the size of list");
                System.out.println("Press (4) to exit from loop");
                System.out.print("enter the option here: ");
                int option = sc.nextInt();
                switch (option) {

                    case 1:
                        System.out.println("Enter element to add: ");
                        str = sc.next();
                        System.out.println(list.add(str));
                        break;
                    case 2:
                        System.out.println("Enter the index you want to remove: ");
                        int num = sc.nextInt();
                        list.remove(num);
                        break;

                    case 3:

                        System.out.println("the list of array: " + list.size());
                        break;

                }
                if (option == 4) {
                    break;
                }
                System.out.println(list);
            }

        }else{
            System.out.println("invalid input");
        }



    }
}
