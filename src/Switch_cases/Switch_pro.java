package Switch_cases;

import java.util.Scanner;

public class Switch_pro {
   public static void main() {
        Scanner input = new Scanner(System.in);
       System.out.println("Enter the fruit name: ");
       String fru = input.nextLine();

       switch (fru) {
           case "apple":
               System.out.println("The fruit is apple");
               break;
           case"orange":
               System.out.println("The fruit is orange");
               break;
           case"grape":
               System.out.println("The fruit is grape");
               break;
           case"kiwi":
               System.out.println("The fruit is kiwi");
               break;
           default:
               System.out.println("Invalid input");


           // Or else this one we can do

//           case ("apple") -> System.out.println("The fruit is apple");
//           case "orange" -> System.out.println("The fruit is orange");
//           case "grape" -> System.out.println("The fruit is grape");
//           case "kiwi" -> System.out.println("The fruit is kiwi");
//           default -> System.out.println("Invalid input");
       }


    }

}
