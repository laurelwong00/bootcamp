package week5.LambdaDemo;

@FunctionalInterface
public interface Calculator {
  int square(int x);

  public static void main(String[] args) {
    Calculator calculator = (x) -> {
      return x * x;
    };

    Calculator calculator2 = x -> x * x;
  }
}
