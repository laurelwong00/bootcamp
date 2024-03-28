public class DemoCD2 {
  public static void main(String[] args) {
      String s = "abcdefg";
      String pattern = "cd"
      for (int i = 0; i < s.length() - 1; i++) {
          if (s.charAt(i) + s.charAt(i+1) == pattern) {
              System.out.println("true");
          } else {

          }
      }
  }
}
