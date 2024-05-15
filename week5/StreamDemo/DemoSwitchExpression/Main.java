package StreamDemo.DemoSwitchExpression;

public class Main {
  public static void main(String[] args) {
    int value = switch (day) {
      case MONDAY, TUESDAY, THURSDAY -> 3;
      case FRIDAY -> 2;
    };
    System.out.println(value);
  }
}
