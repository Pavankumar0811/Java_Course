package Array_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class sample {

    /*
    Enter the size of the lit
    {ress 1 add 2 remove 3 print size 4 exit
    1
    Enter element to add
    Enter
    The zis
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of arraylist");
        int sizeOfArray = sc.nextInt();




        while(true) {

            ArrayList<Integer> list = new ArrayList<>(sizeOfArray);
            System.out.println("press (1) to add press (2) to remove press (3) to print the length of the array");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Eneter element to add");
                    Integer fruit = sc.nextInt();
                    list.add(fruit);
                    break;
                case 2:
                    System.out.println("enter element to remove");
                    list.remove(sc.nextInt());
                    break;
                case 3:
                    System.out.println("enter element to print the length of the array %d" + list.size());
                    break;
                case 4:
                    break;
            }
            if(option == 4){
                break;
            }
        }
    }
}
