package week3;
public class JavaQuest20 {

  public static void main(String[] args) {
    System.out.println(rotateString("abcde", "cdeab"));// true
    System.out.println(rotateString("abcde", "abced"));// false
    System.out.println(rotateString("abcde", "eabcd"));// true
    System.out.println(rotateString("abcde", "abcde"));// true
  }

  public static boolean rotateString(String s, String goal) {

    StringBuilder sb = new StringBuilder(s);
    for (int i = 0; i < s.length(); i++) {
      char firstChar = sb.charAt(0);
      sb.deleteCharAt(0);
      sb.append(firstChar);
      if (sb.toString().equals(goal)) {
        return true;
      }
     }
     return false;
  }
}