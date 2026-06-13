package Linear_search;

import java.util.Scanner;

public class Search1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


         int num = input.nextInt();

        int[] arr = {0,2,14,11,12,16};

        int i = 0;
        int ans = 0;

        for(i = 0; i < arr.length; i++){
        if(arr[i]==num){
             ans = arr[i];
            System.out.println(i);
            break;
           }
          }
           if(num!=ans){
            System.out.println("not found");
            }


        }
    }
