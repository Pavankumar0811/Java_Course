package YTbegning;

import java.util.Scanner;

public class Scanner_problem {
    public static void main() {
        int age;
        String name;


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        age = sc.nextInt();
        sc.nextLine();

        // it will not skip to nextline so we need to put the sc.nextLine();
        // we can also do the new object like sc1 to overcome this problem

        System.out.print("Enter your name: ");
        name = sc.nextLine();


        System.out.println("Your age is " + age);
        System.out.println("Your name is " + name);

        sc.close();
    }
}
