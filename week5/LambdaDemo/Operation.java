package week5.LambdaDemo;

public interface Operation {
  double operate(double x, double y);

  static double calculate(int x, int y, Operation mo) { //參數 can write the interface
    return mo.operate(x, y);
  }

  public static void main(String[] args) {
    Operation addition = (a, b) -> a + b;
    Operation subtract = (a, b) -> a - b;
    Operation multiply = (a, b) -> a * b;
    Operation division = (a, b) -> a / b;
    Operation average = (a, b) -> (a + b)/2;

    System.out.println(Operation.calculate(100, 20, average));
  }
}
