package week4.Recursive;

public class RecursiveDemo {
  public static void main(String[] args) {
  int result = 1;
  for (int i = 0; i <= 5; i++) {
    result *= i;
  }
  System.out.println(result);
  System.out.println(multiply(5));
  System.out.println(addition(4));
  System.err.println(fibonacci(7));
  }

  public static int multiply(int n) {
    if (n<=1){
      return n;
    }
    return n*multiply(n-1);
  }

  public static int addition(int n) {
    if (n <= 2) {
      return n;
    }
    return n + addition(n-2);
  }

  public static int fibonacci(int n) {
    if (n <= 1) {
      return n;
    }
    return fibonacci(n-1) + fibonacci(n-2);
  }
}
