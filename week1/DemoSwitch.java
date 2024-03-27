public class DemoSwitch {

  public static void main(String[] args) {

    char grade = 'A';
    switch (grade) {
      case 'A':
        System.out.println("This is grade A");
        System.out.println("Bootcamp");
        break;
      case 'B':
        System.out.println("This is grade A");
        System.out.println("Bootcamp");
        break;
      case 'C':
        System.out.println("This is grade A");
        System.out.println("Bootcamp");
        break;
      default:
        System.out.println("Default Value");

    } // switch can't compare values, only = 1 value, not boolean
    String str = "I love Java. I love coding";
    if ((str.length() == 27)) { // code here. Fix the bug.
      System.out.println("str length=27");
    } else if ((str.length() < 27)) { // code here ... add the condition
      System.out.println("str length < 27");
    } else { // code here ... complete the code
      System.out.println("str length > 27");
    }

    String s1 = "Hello";
    if (s1.length() > 5) {
      System.out.println("yes");
    } else {
      System.out.println("No");
    }
    // Another approach
    if (!(s1.length() <= 5)) {
      System.out.println("yes");
    } else {
      System.out.println("No");
    }
    // char (==, >=, <=, >, <, !=)
    char gender = '*';
    {
      if (gender == 'M') {
        System.out.print("Male");
      } else if (gender != 'M'){
        System.out.print("Not a male");
      }
        

    }

    // boolean 
    int v = 11;
    boolean b1 = v > 10;
    if (b1 == true) {
      System.out.print("wrong");

    }
    if (b1 != true) {
      System.out.print("correct");

    }
    String s2 = "abcdefg";
    if ((s2.charAt(0) == 'a') && (s2.charAt(6) == 'g')) {
      System.out.print("Yes");
    } else {
      System.out.print("No"); 
    }

  }
}

