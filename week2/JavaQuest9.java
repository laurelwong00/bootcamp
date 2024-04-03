package week2;

public class JavaQuest9 {
  public static void main(String[] args) {
    String str = "VenturenixLAB, Java";

    // prints J
    // prints e (the 1st e)
    char c = str.charAt(str.indexOf('J'));
    System.out.println(c);

    int idx = 0;
    for (int i = 0; i < str.length(); i++) {
      if ('e' == str.charAt(i)) {
        idx = i;
        break;
      }
    }
    System.out.println(str.charAt(idx));

    // Use indexOf()
    // prints 3
    // prints 9
    // prints 10
    System.out.println(str.indexOf('t'));
    System.out.println(str.indexOf('x'));
    System.out.println(str.indexOf('L'));

    // Use String trim()
    String abc = "    ab c    ";
    // prints "ab c"
    System.out.println(abc.trim());

    // Use String replace() method
    // prints VenturenixLAB, Coding
    String after = str.replace("Java", "Coding");
    System.out.println(after);

    // int length()
    // prints 19
    System.out.println(str.length());

    // Use String substring(int start, int end)
    // prints "ren"
    String newstr = str.substring(5,8); //if 5,8 only prints 567 no 8
    System.out.println(newstr);

    // print "VENTURENIXLAB, JAVA"
    // prints "venturenixlab, java"
    System.out.println(str.toUpperCase());
    System.out.println(str.toLowerCase());

    // Method Chaining (one line to complete)
    // prints "V*NTUR*NIXLAB, JAVA!!!"
    String after1 = str.toUpperCase().replace("e", "*").concat("!!!");
    System.out.println(after1);

  }
  
}
