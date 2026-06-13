package Switch_cases;

import java.util.Scanner;

public class Switch_pro3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = Integer.compare(a, b);    // it will always return 1 , -1 , 0
                                               // for example a = 10 b= 20  a-b = -10 so -1 like that
                                               //   to check     System.out.println(result);

        switch(result) {
            case 1:
                System.out.println(a + " is Greater than " + b);
                break;
            case -1:
                System.out.println(a + " is Less than " + b);
                break;
            case 0:
                System.out.println(a + " and " + b + " are Equal");
                break;

        }


    }

    }


