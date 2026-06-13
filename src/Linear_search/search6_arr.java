package Linear_search;

import java.util.Scanner;

public class search6_arr {
    public static void main(String[] args) {
        int[] arr = {1,2,5,20,30,10,0};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start");
        int start = sc.nextInt();
        System.out.println("Enter the end");
        int end = sc.nextInt();
        System.out.println("Enter the value to find");
        int value = sc.nextInt();

        int i = 0;

        for(i = start; i < end; i ++){
            if(arr[i]==value){
                System.out.println(arr[i]+ " is at index " + i);
                break;
            }
        }
        if (arr[i]!=value){
            System.out.println("not found");
        }
    }
}
