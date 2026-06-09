package YTbegning;

import java.util.Scanner;

public class Scanner_execution {

   public static void main() {

       String name;
       int age;
       double GPA;
       boolean Student;

       Scanner sc = new Scanner(System.in);

       System.out.print("Enter your name: ");
       name = sc.nextLine();

       System.out.print("Enter your age: ");
       age = sc.nextInt();

       System.out.print("Enter your GPA: ");
       GPA = sc.nextDouble();

       System.out.print("Enter your Student (true/false): ");
       Student = sc.nextBoolean();

       if(Student){
           System.out.println("Your are a student "+ name);

       }else{
           System.out.println("your not a student "+ name);
       }

       sc.close();


    }
}
