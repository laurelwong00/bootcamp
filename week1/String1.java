
// Java; compile language; java file (Helloworld.java)->compile -> class file
// (byte code)
//String is a keyword in java
public class String1 {
  public static void main(String []args) {
    int x = 0;
    String y = "capybara";
    //Tool for String
    int lengthOfy = y.length(); //8
    System.out.println(y.length());
    char character = y.charAt(5);
    System.out.println(y.charAt(5));

    //equals
    String s1 = "hello";
    String s2 = "hello";

    boolean isS1EqualsToS2 = s1.equals(s2);
    System.out.println(isS1EqualsToS2);

    // concat
    String s3 = s1 + " " + s2;
    String s4 = s1 + s2;
    System.out.println(s3);
    System.out.println(s4);
    System.out.println(s4 + 10);//String + anything = String + String
    System.out.println(s4 + 3.5 + 10 + true + "haha");//can add all types

  }  
}
