public class DemoForLoopmk3 {
  public static void main(String [] args) {
    String str = "abcdefghijklmnop";
    for (int i = str.length()-1; i  >= 0; i--) {
      System.out.print(str.charAt(i));
    }
  }
}
