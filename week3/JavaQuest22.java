package week3;

public class JavaQuest22 {
  public static void main(String[] args) {
    System.out.println(findDifferent(1)); // output : 0
    System.out.println(findDifferent(100000));// output : -1
    System.out.println(findDifferent(234)); // output : 15
    System.out.println(findDifferent(4568));// output : 937
    System.out.println(findDifferent(9999));// output : 6525
    System.out.println(findDifferent(11111));// output : -4

  }

  public static int findDifferent(int n) {
    String numberString = String.valueOf(n);
    int product = 1;
    int sum = 0;
    for (int i = 0; i < numberString.length(); i++) {
      sum += numberString.charAt(i) - '0';
      product *= numberString.charAt(i) - '0';
    }
    return product - sum;
  }
}