package week3;
import java.lang.Math;
import java.math.BigInteger;

public class JavaQuest21 {
  public static void main(String[] args) {
    System.out.println(isThreeDivisors(1)); // false
    System.out.println(isThreeDivisors(3)); // false
    System.out.println(isThreeDivisors(4)); // true
    System.out.println(isThreeDivisors(12));// false
    System.out.println(isThreeDivisors(9999));// false

  }

  public static boolean isThreeDivisors(int n) {
    double root = Math.sqrt(n);
    if (root == (int)root) {
      BigInteger R = new BigInteger(String.valueOf((int) root));
      if (R.isProbablePrime(100)) {
        return true;
      }
    }
    return false;
  }
}
