package week3.ourRestaurant;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
      System.out.println("Welcome to our restaurant.");
      System.out.println("What would you like to order?");
      System.out.println(Arrays.toString(Menu.items));
      Scanner input = new Scanner(System.in);
      int price;
      while (true) {
        String order = input.nextLine();
        if (Menu.haveItem(order)) {
          price = Menu.priceOfOrder(order);
          System.out.println("That will be " + price);
          break;
        } 
        else {
          System.out.println("can you repeat your order?");
        };
      }
      System.out.println("How much do you wanna pay");
      while (true) {
        int payment = input.nextInt();
        if (payment == price) {
          System.out.println("Thankyou have a nice day!");
          break;
        } else if (payment > price) {
          System.out.println("Your change is " + (payment - price)+ ". Thankyou have a nice day!");
          break;
        } else {
          System.out.println("NOT ENOUGH");
        }
      }
      
  }
}
