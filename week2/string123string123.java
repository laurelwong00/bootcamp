package week2;

public class string123string123 {
  public static void main(String[] args) {
    String str = "123Wong123Chan";
    int num1 = 0;
    String str1 = "";
    for (int i = 0; i < str.length(); i++) {
      if (i == 0) {
        num1 = (str.charAt(i) - '0');
      }
      else if (i > 0) {
        if (str.charAt(i) - '0' >= 10) { // str.charAt(i) is an alphabet
          if (str.charAt(i-1) - '0' < 10) { //str.charAt(i-1) is a number
            str1 += str.charAt(i);
          }
          else if (str.charAt(i-1) - '0' >= 10) { //str.charAt(i-1) is an alphabet
            str1 += str.charAt(i);
          }
        }
        num1 = num1*10 + (str.charAt(i) - '0');
      } 
    }
  }
}
