package week3;

public class StringBuilderDemo {
  public static void main(String[] args) {
    String s1 = "abc";
    String s2 = "def";

    String result = s1+s2;
    String result2 = s1.concat(s2); //concat() -> return new String
  }

  StringBuilder sb1 = new StringBuilder("hello");
  System.out.println(sb1.toString());

  StringBuilder sb2 = sb2.append("World");

  //insert() 
  
  sb2.deleteCharAt(3);
}
