package Country.Zones;


//import java.awt.*;
import java.util.Scanner;

public class State{
   static Scanner input = new Scanner(System.in);
   private static Zone zone;

   public static void showMainMenu(){
      String menu = """
              Select Your Choice
              1 => Geopolitical Zone
              2 => Exit
              """;
      print(menu);

      print("What is Your Choice?: ");
      char choice = input.next().charAt(0);

      switch(choice){
            case '1':
            geopoliticalZone(choice);
            showMainMenu();

            case '2':
               print("Exiting Applcation");
               System.exit(0);
               default:
                  print("Invalid Choice, Enter a correct option");
                  showMainMenu();
      }
   }

   private static void print(String message) {
      System.out.println(message);
   }
   private static void geopoliticalZone(char choice){
      print("Enter State: ");
      String state = input.next().replaceAll("[-_,@#']", "").toLowerCase();
      System.out.println("My case: " + state);
      zone = Zone.getZoneName(state);
      print(state+"is a part of the "+zone.toString()+" Zone");
      showMainMenu();
   }

   public static void main(String[] args){
      showMainMenu();
   }
}
