public class JavaQuest5 {
  public static void main(String [] args) {
    String str = "Welcome to the coding bootcamp."; // You should not change this line
    char target = 'c'; // Update this target to test the logic
    int count = 0;

    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == target) {
        count++;
      } 
    } 

    if (count > 0) {
      System.out.println("We found " + count + " character c in the String.");
    } else if (count == 0) {
      System.out.println("no such character");
    }


}
}
      


// if found, print "We found 3 character c in the String."
// if not found, print "Not Found."
// code here ...
