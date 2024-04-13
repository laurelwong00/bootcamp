package week3.ourWorld;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    World myWorld = new World();
    System.out.println("Welcome to the new world.");
    while (true) {
      System.out.println("Create an Object or End:");
      String action = input.nextLine();
      if (action == "Add Person") {
        System.out.println("Name: ");
        String name = input.nextLine();
        System.out.println("Blood Type: ");
        char bloodType = input.nextLine().toCharArray()[0];
        myWorld.addPerson(name, bloodType);
        
      } else if (action == "Add Pet") {
        System.out.println("Size: ");
        int size = input.nextInt();
        System.out.println("Type: ");
        String type = input.nextLine();
        System.out.println("Who is the master? ");
        String name = input.nextLine();
        
      }
    }
  }
}
