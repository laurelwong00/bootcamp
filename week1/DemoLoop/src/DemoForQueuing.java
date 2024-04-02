import java.util.Scanner;
import java.util.ArrayList;

public class DemoForQueuing {
  public static void main(String[] args) {
    ArrayList<String> queue = new ArrayList<String>();
    int newMemberPosition = 0;

    while (true) {
      Scanner input = new Scanner(System.in);
      System.out.println("Input name: ");
      String name = input.next();
      // int position = input.nextInt();
      if (newMemberPosition < 5) { //queue.size() < 5
        name = "Mr. " + name;
      }
      queue.add(newMemberPosition++, name);//queue.size
      System.out.println(queue);
    }
    

  }
}
